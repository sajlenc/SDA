package src.currency;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

public class SelectedDateCurrency {
    @Getter
    @SerializedName("table")
    private String table;
    @SerializedName("no")
    private String no;
    @SerializedName("effectiveDate")
    private String date;
    @SerializedName("rates")
    private List<Rate> rates;
}
