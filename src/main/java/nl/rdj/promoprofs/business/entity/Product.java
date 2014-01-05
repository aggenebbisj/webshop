package nl.rdj.promoprofs.business.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
@NamedQuery(name=Product.ALL, query="Select p From Product p"),
@NamedQuery(name=Product.BY_NAME,query="Select p From Product p where p.name = :name") })
public class Product implements Serializable {

    public static final String ALL = "nl.rdj.promoprofs.Product.ALL";
    public static final String BY_NAME = "nl.rdj.promoprofs.Product.BY_NAME";
    
    @Id
    private long id;
    private String name;

    public Product() {
    }
    
    public Product(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
