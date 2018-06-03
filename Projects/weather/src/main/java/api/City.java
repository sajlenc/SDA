package api;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class City {
    @SerializedName("title")
    private String title;

    @SerializedName("woeid")
    private int id;
}
