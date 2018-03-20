package th.ac.kmitl.it.se.soa2018.group1.application.model;

public class SellerModel {

    private String name;
    private String specifiedTaxRegistrationID;
    private TradeAddressModel tradeAddressModel;

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

    public TradeAddressModel getTradeAddressModel() {
        return tradeAddressModel;
    }

    public void setTradeAddressModel(TradeAddressModel tradeAddressModel) {
        this.tradeAddressModel = tradeAddressModel;
    }
}
