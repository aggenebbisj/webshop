package nl.rdj.promoprofs.presentation;

import javax.json.JsonObject;
import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("products")
public class ProductResource {
    
    @GET
    public JsonObject getProducts() {
        return Json.createObjectBuilder()
                .add("0", "Fleece deken groen")
                .add("1", "Mok Groningen")
                .add("2", "Bierplu")
                .build();
    }
    
}
