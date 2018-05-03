package th.ac.kmitl.it.se.soa2018.group1.application.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellerTest {

    private final String sellerID = "comp1123456";
    private final String sellerGlobalID = "TH00000564857495";
    private final String sellerName = "บริษัท ร่วมสมยัธุรกรรมอิเล็กทรอนิกส์ จำกัด";
    private final String taxRegistrationId = "057552600909900000";
    private final ContactDetail sellerDetail = ContactDetail.builder().build();
    private final Address sellerAddress = Address.builder().build();

    @Test
    public void checkInputCorrectData() {

        Seller seller = Seller.builder()
                .sellerID(this.sellerID)
                .sellerGlobalID(this.sellerGlobalID)
                .sellerName(this.sellerName)
                .taxRegistrationID(this.taxRegistrationId)
                .sellerContact(this.sellerDetail)
                .sellerAddress(this.sellerAddress)
                .build();

        assertEquals(this.sellerID, seller.getSellerID());
        assertEquals(this.sellerGlobalID, seller.getSellerGlobalID());
        assertEquals(this.sellerName, seller.getSellerName());
        assertEquals(this.taxRegistrationId, seller.getTaxRegistrationID());
        assertEquals(this.sellerDetail, seller.getSellerContact());
        assertEquals(this.sellerAddress, seller.getSellerAddress());

    }

}
