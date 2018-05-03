package th.ac.kmitl.it.se.soa2018.group1.application.model;

import lombok.Builder;
import lombok.Data;

@Builder
public @Data class ProductCategory {

    private String code;
    private String name;

}
