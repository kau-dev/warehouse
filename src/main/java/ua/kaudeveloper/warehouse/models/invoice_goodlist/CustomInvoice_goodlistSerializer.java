package ua.kaudeveloper.warehouse.models.invoice_goodlist;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class CustomInvoice_goodlistSerializer extends StdSerializer<Invoice_goodlist> {
    private static final long serialVersionUID = 1L;

    protected CustomInvoice_goodlistSerializer(Class<Invoice_goodlist> t) {
        super(t);
    }

    protected CustomInvoice_goodlistSerializer() {
        this(null);
    }


    @Override
    public void serialize(Invoice_goodlist value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();

        provider.defaultSerializeField("id", value.getId(), gen);
        if (value.getGood() != null) {
            provider.defaultSerializeField("good_id", value.getGood().getId(), gen);
            provider.defaultSerializeField("good_name", value.getGood().getName(), gen);
        } else {
            provider.defaultSerializeField("good_id", null, gen);
            provider.defaultSerializeField("good_name", "", gen);
        }
        if (value.getInvoice() != null) {
            provider.defaultSerializeField("invoice_id", value.getInvoice().getId(), gen);
        } else {
            provider.defaultSerializeField("invoice_id", null, gen);
        }
        provider.defaultSerializeField("price", value.getPrice(), gen);
        provider.defaultSerializeField("qty", value.getQty(), gen);
        provider.defaultSerializeField("summ", value.getSumm(), gen);
        provider.defaultSerializeField("tax", value.getTax(), gen);

        gen.writeEndObject();
    }
}
