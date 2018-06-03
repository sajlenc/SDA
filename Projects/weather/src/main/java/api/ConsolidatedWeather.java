package api;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ConsolidatedWeather {
    @SerializedName("min_temp")
    private double minTemp;
    @SerializedName("max_temp")
    private double maxTemp;
}
