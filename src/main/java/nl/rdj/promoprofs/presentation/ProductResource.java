package nl.rdj.promoprofs.presentation;

import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.json.JsonObject;
import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import nl.rdj.promoprofs.business.boundary.FindProduct;
import nl.rdj.promoprofs.business.entity.Product;

@Path("products")
public class ProductResource {
    
    @EJB
    private FindProduct findProduct;
    
    @GET
    public JsonObject getProducts() {
        final JsonObjectBuilder jsonBuilder = Json.createObjectBuilder();
        for (Product product : findProduct.findProducts()) {
            jsonBuilder.add(Long.toString(product.getId()), product.getName());
        }
        return jsonBuilder.build();
    }
    
}
