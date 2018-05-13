package th.ac.kmitl.it.se.soa2018.group1.application;

import lombok.Builder;
import lombok.Data;

@Builder
public @Data class Seller {

    private String id;
    private String globalID;
    private String name;
    private String taxRegistrationID;
    private ContactDetail contact;
    private Address address;

}
