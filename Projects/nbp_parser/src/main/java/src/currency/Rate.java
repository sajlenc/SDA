package src.currency;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Rate {
    @SerializedName("currency")
    private String currency;
    @SerializedName("no")
    private String no;
    @SerializedName("effectiveDate")
    private String date;
    @SerializedName("mid")
    private double mid;
    @SerializedName("code")
    private String code;
}
