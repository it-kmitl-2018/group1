package th.ac.kmitl.it.se.soa2018.group1.application.form;

import lombok.Builder;
import lombok.Data;

@Builder
public @Data class AddressForm {

    private String postCode;
    private String buildingName;
    private String soi;
    private String village;
    private String moo;
    private String street;
    private String city;
    private String district;
    private String countryId;
    private String buildingNumber;

}