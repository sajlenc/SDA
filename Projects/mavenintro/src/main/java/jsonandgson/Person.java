package jsonandgson;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Getter

public class Person {
    @SerializedName("id")
    private int id;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("email")
    private String email;
    @SerializedName("country")
    private String country;
    @SerializedName("vip")
    private boolean isVip;
}
