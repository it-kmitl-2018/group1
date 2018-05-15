package th.ac.kmitl.it.se.soa2018.group1.application.model;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Builder
public @Data class Product {

    private String id;
    private String globalID;
    private String name;
    private String description;
    private Timestamp expireDateTime;
    private ProductCategory productCategory;
    private String countryID;
    private IncludedNote includedNote;

}
