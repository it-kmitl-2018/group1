package th.ac.kmitl.it.se.soa2018.group1.application.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Builder;
import th.ac.kmitl.it.se.soa2018.group1.application.model.IncludedNote;
import th.ac.kmitl.it.se.soa2018.group1.application.model.ProductCategory;

import java.sql.Timestamp;

@Builder
public class ProductXml {

    @JacksonXmlProperty(localName = "id")
    public String id;

    @JacksonXmlProperty(localName = "global_id")
    public String globalId;

    @JacksonXmlProperty(localName = "name")
    public String name;

    @JacksonXmlProperty(localName = "description")
    public String description;

    @JacksonXmlProperty(localName = "batch_id")
    public String lotNumber;

    @JacksonXmlProperty(localName = "expiry_date_time")
    public Timestamp expiryDateTime;

    @JacksonXmlProperty(localName = "product_category")
    public ProductCategory productCategory;

    @JacksonXmlProperty(localName = "country_id")
    public String countryId;

    @JacksonXmlProperty(localName = "note")
    public IncludedNote note;

}
