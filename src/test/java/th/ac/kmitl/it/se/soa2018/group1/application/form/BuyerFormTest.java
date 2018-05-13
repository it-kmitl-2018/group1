package th.ac.kmitl.it.se.soa2018.group1.application.form;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuyerFormTest {

    private String id = "123456789012345";
    private String globalId = "12345";
    private String name = "อุรัสยา เสปอร์บันด์";
    private String taxRegistrationId = "10434916762554";
    private String branchId = "000";
    private String email = "kcomic191@gmail.com";
    private AddressForm addressForm = AddressForm.builder().build();

    @Test
    public void shouldGetAllInfo() {
        BuyerForm buyerForm = BuyerForm.builder()
                .id(this.id)
                .globalID(this.globalId)
                .name(name)
                .taxRegistrationID(this.taxRegistrationId)
                .branchId(this.branchId)
                .email(this.email)
                .addressForm(this.addressForm)
                .build();

        assertEquals(this.id, buyerForm.getId());
        assertEquals(this.globalId, buyerForm.getGlobalID());
        assertEquals(this.name, buyerForm.getName());
        assertEquals(this.taxRegistrationId, buyerForm.getTaxRegistrationID());
        assertEquals(this.branchId, buyerForm.getBranchId());
        assertEquals(this.email, buyerForm.getEmail());
        assertEquals(this.addressForm, buyerForm.getAddressForm());
    }
}