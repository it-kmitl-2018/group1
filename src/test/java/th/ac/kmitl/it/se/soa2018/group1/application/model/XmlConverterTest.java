package th.ac.kmitl.it.se.soa2018.group1.application.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.junit.Test;
import th.ac.kmitl.it.se.soa2018.group1.application.converters.XmlConverter;

import static org.junit.Assert.assertEquals;

public class XmlConverterTest {

    private class Xml {
        @JacksonXmlProperty(localName = "id")
        private int id = 0;
        @JacksonXmlProperty(localName = "name")
        private String name = null;
    }

    private String xml =
            "<Xml>" +
                    "<id>0</id>" +
                    "</Xml>";

    @Test
    public void shouldGetCorrectXml() {
        XmlConverter xmlConverter = new XmlConverter();
        assertEquals(xml, xmlConverter.toXml(new Xml()));
    }

}
