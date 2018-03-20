package th.ac.kmitl.it.se.soa2018.group1.application.model;

public class TradeAddressModel {

    private String postcode;
    private String cityName;
    private String citySubDivisionName;
    private String countryID;
    private String countrySubDivisionID;
    private String buildingName;
    private String alley;
    private String street;

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
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

    public String getCountrySubDivisionID() {
        return countrySubDivisionID;
    }

    public void setCountrySubDivisionID(String countrySubDivisionID) {
        this.countrySubDivisionID = countrySubDivisionID;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getAlley() {
        return alley;
    }

    public void setAlley(String alley) {
        this.alley = alley;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
