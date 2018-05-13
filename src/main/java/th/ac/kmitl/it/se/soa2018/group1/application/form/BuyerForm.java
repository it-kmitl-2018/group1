package th.ac.kmitl.it.se.soa2018.group1.application.form;

import lombok.Builder;
import lombok.Data;

@Builder
public @Data class BuyerForm {

    private String id;
    private String globalID;
    private String name;
    private String taxRegistrationID;
    private String branchId;
    private String email;
    private AddressForm addressForm;

}
