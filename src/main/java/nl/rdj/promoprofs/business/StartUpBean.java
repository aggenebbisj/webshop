package nl.rdj.promoprofs.business;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.transaction.UserTransaction;
import nl.rdj.promoprofs.business.entity.Product;

@Startup
@Singleton
public class StartUpBean {

    @PersistenceContext
    private EntityManager em;

    @PostConstruct
    public void init() {
        System.out.println("--- seeding data");
        em.merge(new Product(0, "Fleece deken groen"));
        em.merge(new Product(1, "Mok Groningen"));
        em.merge(new Product(2, "Bierplu"));
    }

}
