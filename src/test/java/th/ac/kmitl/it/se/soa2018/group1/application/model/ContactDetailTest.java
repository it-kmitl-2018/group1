package th.ac.kmitl.it.se.soa2018.group1.application.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContactDetailTest {

    private String personName = "หรรษธร ช่วยอ่อน";
    private String departmentName = "HR";
    private String email = "58070159@kmitl.ac.th";
    private String phoneNumber = "0915945612";

    @Test
    public void checkInputCorrectData() {

        ContactDetail contactDetail = ContactDetail.builder()
                .personName(this.personName)
                .departmentName(this.departmentName)
                .email(this.email)
                .phoneNumber(this.phoneNumber)
                .build();

        assertEquals(this.personName, contactDetail.getPersonName());
        assertEquals(this.departmentName, contactDetail.getDepartmentName());
        assertEquals(this.email, contactDetail.getEmail());
        assertEquals(this.phoneNumber, contactDetail.getPhoneNumber());

    }

}
