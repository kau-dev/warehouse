package ua.kaudeveloper.warehouse.models.invoce;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class CustomInvoiceSerializer extends StdSerializer<Invoice> {
    private static final long serialVersionUID = 1L;
    protected CustomInvoiceSerializer(Class<Invoice> t) {
        super(t);
    }

    protected CustomInvoiceSerializer() {
        this(null);
    }


    @Override
    public void serialize(Invoice value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();

        provider.defaultSerializeField("id", value.getId(), gen);
        if (value.getCreation_date() != null) {
            String pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            provider.defaultSerializeField("creation_date", simpleDateFormat.format(value.getCreation_date()), gen);
        } else {
            provider.defaultSerializeField("creation_date", null, gen);
        }

        provider.defaultSerializeField("conterparty_id", value.getConterparty().getId(), gen);
        if(value.getConterparty()!=null){
            provider.defaultSerializeField("conterparty_id", value.getConterparty().getId(), gen);
            provider.defaultSerializeField("conterparty_name", value.getConterparty().getName(), gen);
        }else{
            provider.defaultSerializeField("conterparty_id", null, gen);
            provider.defaultSerializeField("conterparty_name", "", gen);
        }
        if(value.getEmploee()!=null){
            provider.defaultSerializeField("emploee_id", value.getEmploee().getId(), gen);
            provider.defaultSerializeField("emploee_name", value.getEmploee().getName(), gen);
        }else{
            provider.defaultSerializeField("emploee_id", null, gen);
            provider.defaultSerializeField("emploee_name", "", gen);
        }
        provider.defaultSerializeField("full_cost", value.getFull_cost(), gen);
        if(value.getGoodslist()!=null) {
            provider.defaultSerializeField("goods_list", value.getGoodslist(), gen);
        }
        gen.writeEndObject();
    }
}
