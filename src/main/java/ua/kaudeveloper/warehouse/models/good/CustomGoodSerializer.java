package ua.kaudeveloper.warehouse.models.good;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class CustomGoodSerializer extends StdSerializer<Good> {
    private static final long serialVersionUID = 1L;

    protected CustomGoodSerializer(Class<Good> t) {
        super(t);
    }

    public CustomGoodSerializer() {
        this(null);
    }

    @Override
    public void serialize(Good value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();

        provider.defaultSerializeField("id", value.getId(), gen);
        provider.defaultSerializeField("name", value.getName(), gen);
        provider.defaultSerializeField("group", value.isThis_group(), gen);
        provider.defaultSerializeField("barcode", value.getBarcode(), gen);
        provider.defaultSerializeField("code", value.getCode(), gen);
        provider.defaultSerializeField("external_code", value.getExternal_code(), gen);
        if (value.getParent() != null) {
            provider.defaultSerializeField("parent", value.getParent().getId(), gen);
            provider.defaultSerializeField("parent_name", value.getParent().getName(), gen);
        } else {
            provider.defaultSerializeField("parent", null, gen);
            provider.defaultSerializeField("parent_name", "", gen);
        }
        if (value.getCategory() != null) {
            provider.defaultSerializeField("category", value.getCategory().getId(), gen);
            provider.defaultSerializeField("category_name", value.getCategory().getName(), gen);
        } else {
            provider.defaultSerializeField("category", null, gen);
            provider.defaultSerializeField("category_name", "", gen);
        }
        provider.defaultSerializeField("units", value.getUnits_m().getId(), gen);

        gen.writeEndObject();
    }
}