package th.ac.kmitl.it.se.soa2018.group1.TaxInvoiceWebApplication.model;

public class PostalTradeAddress {
    private String postcodeCode;
    private String cityName;
    private String citySubDivisionName;
    private String countryID;
    private int countrySubDivisionID;
    private String buildingNumber;

    public String getPostcodeCode() {
        return postcodeCode;
    }

    public void setPostcodeCode(String postcodeCode) {
        this.postcodeCode = postcodeCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCitySubDivisionName() {
        return citySubDivisionName;
    }

    public void setCitySubDivisionName(String citySubDivisionName) {
        this.citySubDivisionName = citySubDivisionName;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public int getCountrySubDivisionID() {
        return countrySubDivisionID;
    }

    public void setCountrySubDivisionID(int countrySubDivisionID) {
        this.countrySubDivisionID = countrySubDivisionID;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
}
