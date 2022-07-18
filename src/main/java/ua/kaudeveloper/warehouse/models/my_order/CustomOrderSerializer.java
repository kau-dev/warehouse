package ua.kaudeveloper.warehouse.models.my_order;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class CustomOrderSerializer extends StdSerializer<My_order> {
    protected CustomOrderSerializer(Class<My_order> t) {
        super(t);
    }

    protected CustomOrderSerializer() {
        this(null);
    }

    @Override
    public void serialize(My_order value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();

        provider.defaultSerializeField("id", value.getId(), gen);
        if (value.getCreation_date() != null) {
            String pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            provider.defaultSerializeField("creation_date", simpleDateFormat.format(value.getCreation_date()), gen);
        } else {
            provider.defaultSerializeField("creation_date", null, gen);
        }
        if (value.getEmployee() != null) {
            provider.defaultSerializeField("employee_id", value.getEmployee().getId(), gen);
            provider.defaultSerializeField("employee_name", value.getEmployee().getName(), gen);
        } else {
            provider.defaultSerializeField("employee_id", null, gen);
            provider.defaultSerializeField("employee_name", "", gen);
        }
        if (value.getCounterparty() != null) {
            provider.defaultSerializeField("counterparty_id", value.getCounterparty().getId(), gen);
            provider.defaultSerializeField("counterparty_name", value.getCounterparty().getName(), gen);
        } else {
            provider.defaultSerializeField("counterparty_id", null, gen);
            provider.defaultSerializeField("counterparty_name", "", gen);
        }

        provider.defaultSerializeField("sum", value.getSum(), gen);
        provider.defaultSerializeField("total", value.getTax(), gen);

        provider.defaultSerializeField("total", value.getTotal(), gen);
        provider.defaultSerializeField("tax", value.getTax(), gen);
        provider.defaultSerializeField("goods_list", value.getOrder_goodsList(), gen);


        gen.writeEndObject();
    }
}
