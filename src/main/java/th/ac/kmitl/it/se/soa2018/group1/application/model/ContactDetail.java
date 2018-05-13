package th.ac.kmitl.it.se.soa2018.group1.application;

import lombok.Builder;
import lombok.Data;

@Builder
public @Data class ContactDetail {

    private String personName;
    private String departmentName;
    private String email;
    private String phoneNumber;

}
