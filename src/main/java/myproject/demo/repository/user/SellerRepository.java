package myproject.demo.repository.user;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import myproject.demo.domain.user.Customer;
import myproject.demo.domain.user.Seller;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class SellerRepository {

    private final EntityManager em;

    public Long save(Seller seller) {
        em.persist(seller);
        return seller.getId();
    }

    public Seller findOne(Long id) {
        return em.find(Seller.class, id);
    }

}
