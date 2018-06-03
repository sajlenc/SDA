package src.currency;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
@Getter
@ToString
public class SelectedRate {
    @SerializedName("table")
    private String table;
    @SerializedName("currency")
    private String currency;
    @SerializedName("code")
    private String code;
    @SerializedName("rates")
    private List<Rate> rates;

}
