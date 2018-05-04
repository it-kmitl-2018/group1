package th.ac.kmitl.it.se.soa2018.group1.application.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuyerTest {

    private final String buyerID = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private final String buyerGlobalID = "ABCDEFGHIJKLMNOPQRST123456789012345";
    private final String buyerName = "ธำรำ ยืนข ำ";
    private final String taxRegistrationID = "1104599001271";
    private final ContactDetail buyerContact = new ContactDetail();
    private final Address buyerAddress = new Address();

    @Test
    public void checkInputCorrectData(){
        Buyer buyer = Buyer.builder()
                .buyerID(this.buyerID)
                .buyerGlobalID(this.buyerGlobalID)
                .buyerName(this.buyerName)
                .taxRegistrationID(this.taxRegistrationID)
                .buyerContact(this.buyerContact)
                .buyerAddress(this.buyerAddress)
                .build();
        assertEquals(this.buyerID, buyer.getBuyerID());
        assertEquals(this.buyerGlobalID, buyer.getBuyerGlobalID());
        assertEquals(this.buyerName, buyer.getBuyerName());
        assertEquals(this.taxRegistrationID, buyer.getTaxRegistrationID());
        assertEquals(this.buyerContact, buyer.getBuyerContact());
        assertEquals(this.buyerAddress, buyer.getBuyerAddress());
    }

}
