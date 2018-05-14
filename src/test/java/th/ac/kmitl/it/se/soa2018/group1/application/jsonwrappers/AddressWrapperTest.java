package th.ac.kmitl.it.se.soa2018.group1.application.jsonwrappers;

import org.junit.Test;
import th.ac.kmitl.it.se.soa2018.group1.application.model.Address;

import static org.junit.Assert.assertEquals;


public class AddressWrapperTest {

    private String postCode = "10330";
    private String buildingName = "";
    private String soi = "จุฬาซอย 10";
    private String village = "";
    private String moo = "";
    private String streetName = "พระราม 6";
    private String cityName = "1004";
    private String citySubDivisionName = "100402";
    private String countryId = "TH";
    private String countrySubDivisionId = "10";
    private String buildingNumber = "799/89";
    private Address address;

    @Test
    public void shouldGetAllInfo() {
        this.address = Address.builder()
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
        AddressWrapper addressWrapper = new AddressWrapper(address);

        assertEquals(this.address, addressWrapper.address);
    }

}