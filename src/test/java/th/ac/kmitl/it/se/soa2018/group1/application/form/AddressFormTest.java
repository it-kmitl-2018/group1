package th.ac.kmitl.it.se.soa2018.group1.application.form;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressFormTest {
    private final String postCode = "10140";
    private final String buildingName = "เคคอมมิค";
    private final String soi = "ประชาอุทิศ17";
    private final String village = "-";
    private final String moo = "-";
    private final String street = "ประชาอุทิศ";
    private final String city = "กรุงเทพมหานคร";
    private final String district = "ราษฎร์บูรณะ";
    private final String countryId = "TH";
    private final String buildingNumber = "440/23";

    @Test
    public void checkInputCorrectData() {

        AddressForm addressForm = AddressForm.builder()
                .postCode(this.postCode)
                .buildingName(this.buildingName)
                .soi(this.soi)
                .village(this.village)
                .moo(this.moo)
                .street(this.street)
                .city(this.city)
                .district(this.district)
                .countryId(this.countryId)
                .buildingNumber(this.buildingNumber)
                .build();

        assertEquals(this.postCode, addressForm.getPostCode());
        assertEquals(this.buildingName, addressForm.getBuildingName());
        assertEquals(this.soi, addressForm.getSoi());
        assertEquals(this.village, addressForm.getVillage());
        assertEquals(this.moo, addressForm.getMoo());
        assertEquals(this.street, addressForm.getStreet());
        assertEquals(this.city, addressForm.getCity());
        assertEquals(this.district, addressForm.getDistrict());
        assertEquals(this.countryId, addressForm.getCountryId());
        assertEquals(this.buildingNumber, addressForm.getBuildingNumber());

    }
}
