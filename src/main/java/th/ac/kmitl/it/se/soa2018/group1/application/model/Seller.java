package th.ac.kmitl.it.se.soa2018.group1.application.model;

import lombok.Builder;
import lombok.Data;

@Builder
public @Data class Seller {

    private String sellerID;
    private String sellerGlobalID;
    private String sellerName;
    private String taxRegistrationID;
    private ContactDetail sellerContact;
    private Address sellerAddress;

}
