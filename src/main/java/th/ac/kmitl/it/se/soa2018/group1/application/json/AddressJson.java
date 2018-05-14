package th.ac.kmitl.it.se.soa2018.group1.application.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class AddressJson {

    @JsonProperty("line_one")
    public String lineOne;

    @JsonProperty("line_two")
    public String lineTwo;

    @JsonProperty("city_name")
    public String cityName;

    @JsonProperty("city_sub_division_name")
    public String citySubDivisionName;

    @JsonProperty("post_code")
    public String postCode;

    @JsonProperty("country_sub_division")
    public String countrySubDivision;

    @JsonProperty("country_name")
    public String countryName;
}