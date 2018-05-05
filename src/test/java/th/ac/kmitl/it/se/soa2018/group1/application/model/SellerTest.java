package th.ac.kmitl.it.se.soa2018.group1.application.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellerTest {

    private final String id = "comp1123456";
    private final String globalID = "TH00000564857495";
    private final String name = "บริษัท ร่วมสมยัธุรกรรมอิเล็กทรอนิกส์ จำกัด";
    private final String taxRegistrationId = "057552600909900000";
    private final ContactDetail contact = ContactDetail.builder().build();
    private final Address address = Address.builder().build();

    @Test
    public void checkInputCorrectData() {

        Seller seller = Seller.builder()
                .id(this.id)
                .globalID(this.globalID)
                .name(this.name)
                .taxRegistrationID(this.taxRegistrationId)
                .contact(this.contact)
                .address(this.address)
                .build();

        assertEquals(this.id, seller.getId());
        assertEquals(this.globalID, seller.getGlobalID());
        assertEquals(this.name, seller.getName());
        assertEquals(this.taxRegistrationId, seller.getTaxRegistrationID());
        assertEquals(this.contact, seller.getContact());
        assertEquals(this.address, seller.getAddress());

    }

}
