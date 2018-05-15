package th.ac.kmitl.it.se.soa2018.group1.application.model.converters;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.junit.Test;
import th.ac.kmitl.it.se.soa2018.group1.application.converters.JsonConverter;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JsonConverterTest {

    private class Json {
        @JsonProperty("strings")
        private List<String> strings = Arrays.asList("a", "b", "c");
    }

    private String json =
            "{\n" +
                    "    \"strings\" : [\n" +
                    "        \"a\",\n" +
                    "        \"b\",\n" +
                    "        \"c\"\n" +
                    "    ]\n" +
                    "}";

    @Test
    public void shouldGetCorrectJson() {
        JsonConverter jsonConverter = new JsonConverter();
        assertEquals(json, jsonConverter.toJson(new Json()));
    }

}
