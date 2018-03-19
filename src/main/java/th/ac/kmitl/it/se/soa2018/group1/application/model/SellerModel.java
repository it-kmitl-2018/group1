package th.ac.kmitl.it.se.soa2018.group1.application.model;

public class SellerModel {

    private String name;
    private String specifiedTaxRegistrationID;
    private TradeAddress tradeAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecifiedTaxRegistrationID() {
        return specifiedTaxRegistrationID;
    }

    public void setSpecifiedTaxRegistrationID(String specifiedTaxRegistrationID) {
        this.specifiedTaxRegistrationID = specifiedTaxRegistrationID;
    }

    public TradeAddress getTradeAddress() {
        return tradeAddress;
    }

    public void setTradeAddress(TradeAddress tradeAddress) {
        this.tradeAddress = tradeAddress;
    }
}
