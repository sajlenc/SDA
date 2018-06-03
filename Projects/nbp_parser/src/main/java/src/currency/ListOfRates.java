package src.currency;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;
@Getter
public class ListOfRates {
    @SerializedName("table")
    private String table;
    @SerializedName("no")
    private String no;
    @SerializedName("effectiveDate")
    private String date;
    @SerializedName("rates")
    private List<Rate> rates;
}
