package th.ac.kmitl.it.se.soa2018.group1.TaxInvoiceWebApplication.model;

public class SellerTradeParty {
    private String id;
    private String name;
    private String TXID;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTXID() {
        return TXID;
    }

    public void setTXID(String TXID) {
        this.TXID = TXID;
    }
}

class PostalTradeAddress {
    private String postcodeCode;
    private String cityName;
    private String citySubDivisionName;
    private String countryID;
    private int countrySubDivisionID;
    private String buildingNumber;

}
