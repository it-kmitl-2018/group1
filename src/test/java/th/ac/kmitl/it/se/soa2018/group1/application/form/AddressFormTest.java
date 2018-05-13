package th.ac.kmitl.it.se.soa2018.group1.application.form;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressFormTest {
    private final String postCode = "10140";
    private final String buildingName = "เคคอมมิค";
    private final String soi = "ประชาอุทิศ17";
    private final String village = "-";
    private final String moo = "-";
    private final String streetName = "ประชาอุทิศ";
    private final String cityName = "กรุงเทพมหานคร";
    private final String citySubDivisionName = "ราษฎร์บูรณะ";
    private final String countryId = "TH";
    private final String countrySubDivisionId = "2";
    private final String buildingNumber = "440/23";

    @Test
    public void checkInputCorrectData() {

        AddressForm addressForm = AddressForm.builder()
                .postCode(this.postCode)
                .buildingName(this.buildingName)
                .soi(this.soi)
                .village(this.village)
                .moo(this.moo)
                .streetName(this.streetName)
                .cityName(this.cityName)
                .citySubDivisionName(this.citySubDivisionName)
                .countryId(this.countryId)
                .countrySubDivisionId(this.countrySubDivisionId)
                .buildingNumber(this.buildingNumber)
                .build();

        assertEquals(this.postCode, addressForm.getPostCode());
        assertEquals(this.buildingName, addressForm.getBuildingName());
        assertEquals(this.soi, addressForm.getSoi());
        assertEquals(this.village, addressForm.getVillage());
        assertEquals(this.moo, addressForm.getMoo());
        assertEquals(this.streetName, addressForm.getStreetName());
        assertEquals(this.cityName, addressForm.getCityName());
        assertEquals(this.citySubDivisionName, addressForm.getCitySubDivisionName());
        assertEquals(this.countryId, addressForm.getCountryId());
        assertEquals(this.countrySubDivisionId, addressForm.getCountrySubDivisionId());
        assertEquals(this.buildingNumber, addressForm.getBuildingNumber());

    }
}
