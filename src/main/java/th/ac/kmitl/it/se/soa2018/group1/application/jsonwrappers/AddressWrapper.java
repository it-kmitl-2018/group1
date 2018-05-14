package th.ac.kmitl.it.se.soa2018.group1.application.jsonwrappers;

import th.ac.kmitl.it.se.soa2018.group1.application.model.Address;
import th.ac.kmitl.it.se.soa2018.group1.application.json.AddressJson;

public class AddressWrapper {

    public Address address;

    public AddressWrapper(Address address) {
        this.address = address;
    }

    public AddressJson getModelClass(){
        AddressJson addressJson = AddressJson.builder()
                .lineOne(getLine(1,
                        this.address.getBuildingName(),
                        this.address.getBuildingNumber(),
                        this.address.getVillage(),
                        this.address.getSoi(),
                        this.address.getMoo(),
                        this.address.getStreetName()))
                .lineTwo(getLine(2,
                        this.address.getBuildingName(),
                        this.address.getBuildingNumber(),
                        this.address.getVillage(),
                        this.address.getSoi(),
                        this.address.getMoo(),
                        this.address.getStreetName()))
                .cityName(this.address.getCityName())
                .citySubDivisionName(this.address.getCitySubDivisionName())
                .postCode(this.address.getPostCode())
                .countrySubDivision(this.address.getCountrySubDivisionId())
                .countryName(this.address.getCountryId())
                .build();

        return addressJson;
    }

    private String getLine(int lineNum,
                           String buildingName,
                           String buildingNumber,
                           String village,
                           String soi,
                           String moo,
                           String streetName){
        String lineContent = "";

        switch (lineNum){
            case 1: lineContent = buildingName + " " + buildingNumber;
                break;
            case 2: lineContent = village + " " + soi + " " + moo + " " + streetName;
                break;
            default: lineContent = buildingName + " " + buildingNumber + " " +
                    village + " " + soi + " " + moo + " " + streetName;
        }
        return lineContent;
    }
}
