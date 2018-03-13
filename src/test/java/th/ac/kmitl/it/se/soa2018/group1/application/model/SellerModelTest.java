package th.ac.kmitl.it.se.soa2018.group1.application.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellerModelTest {
    private final String NAME = "บริษัท ร่วมสมัยธุรกรรมอิเล็กทรอนิกส์ จำกัด";
    private final String specifiedTaxRegistration = "057552600909900000";

    @Test
    public void checkInputCorrectData() {
        SellerModel sellerModel = new SellerModel();
        sellerModel.setName(NAME);
        sellerModel.setSpecifiedTaxRegistration(specifiedTaxRegistration);

        assertEquals(NAME, sellerModel.getName());
        assertEquals(specifiedTaxRegistration, sellerModel.getSpecifiedTaxRegistration());
    }


}
