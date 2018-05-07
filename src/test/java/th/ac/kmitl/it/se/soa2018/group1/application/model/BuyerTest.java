package th.ac.kmitl.it.se.soa2018.group1.application.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuyerTest {

    private final String id = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private final String globalID = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private final String name = "ธำรำ ยืนข ำ";
    private final String taxRegistrationID = "1104599001271";
    private final ContactDetail contact = ContactDetail.builder().build();
    private final Address address = Address.builder().build();

    @Test
    public void checkInputCorrectData(){
        Buyer buyer = Buyer.builder()
                .id(this.id)
                .globalID(this.globalID)
                .name(this.name)
                .taxRegistrationID(this.taxRegistrationID)
                .contact(this.contact)
                .address(this.address)
                .build();
        assertEquals(this.id, buyer.getId());
        assertEquals(this.globalID, buyer.getGlobalID());
        assertEquals(this.name, buyer.getName());
        assertEquals(this.taxRegistrationID, buyer.getTaxRegistrationID());
        assertEquals(this.contact, buyer.getContact());
        assertEquals(this.address, buyer.getAddress());
    }

}
