package api;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Getter
@ToString
public class CityInfo {
    @SerializedName("title")
    private String title;
    @SerializedName("location_type")
    private String location;
    @SerializedName("latt_long")
    private String lattLong;
    @SerializedName("sun_rise")
    private String sunRise;
    @SerializedName("sun_set")
    private String sunSet;
    @SerializedName("parent")
    private City parent;
    @SerializedName("consolidated_weather")
    private List<ConsolidatedWeather> weather;

    public void displayInfo() {
        System.out.println("City: " + title);
        System.out.printf("%s: %s\n", location, parent.getTitle());
        System.out.printf("Average min. temp: %.2f°C\n", getAverageTemp(true));
        System.out.printf("Average max. temp: %.2f°C\n", getAverageTemp(false));
        System.out.println("Sunrise time: " + getSunRiseSetInfo(sunRise));
        System.out.println("Sunset time: " + getSunRiseSetInfo(sunSet));
        System.out.println("Google Maps link: " + getGoogleMapsLink());
    }

    private String getGoogleMapsLink() {
        return String.format("https://www.google.pl/maps/@%s,10z", lattLong);
    }

    private double getAverageTemp(boolean isMin) {
        double sum = 0;

//        for (ConsolidatedWeather weather : weather) {
//            if (isMin) {
//                sum += weather.getMinTemp();
//            } else {
//                sum += weather.getMaxTemp();
//            }
//        }

        sum = weather.stream()
                .map(s -> isMin ? s.getMinTemp() : s.getMaxTemp())
                .mapToDouble(Double::doubleValue)
                .sum();

        return sum / weather.size();
    }

    public String getSunRiseSetInfo(String sun) {
        DateTime dateTime = ISODateTimeFormat
                .dateTime()
//                .hourMinuteSecondMillis()
//                .withOffsetParsed()
                .parseDateTime(sun);

        DateTimeFormatter formatter = DateTimeFormat.forPattern("HH:mm, dd.MM.yyyy");
        return formatter.print(dateTime);
    }
    public void generateHTML(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("weather.html");
            fileOutputStream.write(generateContent().getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String generateContent() {
        Map<String, String> map = generateMap();
        StringBuilder sb = new StringBuilder();

        sb.append("<table>");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("<tr>");
            sb.append("<td>" + entry.getKey() + "</td>");
            sb.append("<td>" + entry.getValue() + "</td>");
            sb.append("</tr>");
        }
        sb.append("</table>");
        return sb.toString();
    }

    private Map<String, String> generateMap() {
        Map<String, String> map = new TreeMap<>();
        map.put("City: ", title);
        map.put(location, parent.getTitle());
        map.put("Average min. temp: ", getAverageTemp(true) + "°C");
        map.put("Average max. temp: ", getAverageTemp(false) + "°C");
        map.put("Sunrise time: ", getSunRiseSetInfo(sunRise));
        map.put("Sunset time: ", getSunRiseSetInfo(sunSet));
        map.put("Google Maps link: ", "<a href=\"" + getGoogleMapsLink() + "\">Google maps</a>");

        return map;
    }
}
