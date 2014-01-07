package nl.rdj.promoprofs.presentation;

import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import nl.rdj.promoprofs.business.boundary.FindProduct;
import nl.rdj.promoprofs.business.entity.Product;

@Path("products")
public class ProductResource {

    @EJB
    private FindProduct findProduct;

    @GET
    public JsonArray getProducts() {
        final JsonArrayBuilder builder = Json.createArrayBuilder();
        for (Product product : findProduct.findProducts()) {
            builder.add(Json.createObjectBuilder()
                    .add("id", Long.toString(product.getId()))
                    .add("name", product.getName())
                    .build());
        }
        return builder.build();
    }

}
