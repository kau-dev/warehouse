package ua.kaudeveloper.warehouse.models.order_goodslist;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class CustomOrder_goodslistSerializer extends StdSerializer<Order_goodslist> {
    protected CustomOrder_goodslistSerializer(Class<Order_goodslist> t) {
        super(t);
    }

    protected CustomOrder_goodslistSerializer() {
        this(null);
    }

    @Override
    public void serialize(Order_goodslist value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();

        provider.defaultSerializeField("id", value.getId(), gen);
        if (value.getOrder() != null) {
            provider.defaultSerializeField("oder_id", value.getOrder().getId(), gen);
        } else {
            provider.defaultSerializeField("oder_id", null, gen);
        }
        if (value.getGood() != null) {
            provider.defaultSerializeField("good_id", value.getGood().getId(), gen);
            provider.defaultSerializeField("good_name", value.getGood().getName(), gen);
        } else {
            provider.defaultSerializeField("good_id", null, gen);
            provider.defaultSerializeField("good_name", "", gen);
        }
        provider.defaultSerializeField("qty", value.getQty(), gen);
        provider.defaultSerializeField("price_without_tax", value.getPrice_without_tax(), gen);


        gen.writeEndObject();
    }
}
