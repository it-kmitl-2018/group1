package th.ac.kmitl.it.se.soa2018.group1.application.model;

import lombok.Builder;
import lombok.Data;

@Builder
public @Data class Buyer {

    private String buyerID;
    private String buyerGlobalID;
    private String buyerName;
    private String taxRegistrationID;
    private ContactDetail buyerContact;
    private Address buyerAddress;

}
