package th.ac.kmitl.it.se.soa2018.group1.application.model;

import lombok.Builder;
import lombok.Data;

@Builder
public @Data class Address {

    private String postCode;
    private String buildingName;
    private String soi;
    private String village;
    private String moo;
    private String streetName;
    private String cityName;
    private String citySubDivisionName;
    private String countryId;
    private String countrySubDivisionId;
    private String buildingNumber;

}
