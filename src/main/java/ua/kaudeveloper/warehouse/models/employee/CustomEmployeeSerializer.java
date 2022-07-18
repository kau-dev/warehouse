package ua.kaudeveloper.warehouse.models.employee;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class CustomEmployeeSerializer extends StdSerializer<Employee> {
    protected CustomEmployeeSerializer(Class<Employee> t) {
        super(t);
    }

    public CustomEmployeeSerializer() {
        this(null);
    }

    @Override
    public void serialize(Employee value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        provider.defaultSerializeField("id", value.getId(), gen);
        provider.defaultSerializeField("name", value.getName(), gen);
        provider.defaultSerializeField("position", value.getPosition(), gen);
        if (value.getStorage() != null) {
            provider.defaultSerializeField("storage", value.getStorage().getId(), gen);
        } else {
            provider.defaultSerializeField("storage", null, gen);
        }
        provider.defaultSerializeField("country", value.getCountry(), gen);
        gen.writeEndObject();
    }
}
