package nl.rdj.promoprofs.business.boundary;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import nl.rdj.promoprofs.business.entity.Product;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)

public class FindProduct {

    @PersistenceContext
    private EntityManager em;

    public List<Product> findProducts() {
        return em.createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }

}
