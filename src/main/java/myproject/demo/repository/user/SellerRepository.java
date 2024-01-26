package myproject.demo.repository.user;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import myproject.demo.domain.member.Seller;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SellerRepository {

    private final EntityManager em;

    public Long save(Seller seller) {
        em.persist(seller);
        return seller.getId();
    }

    public Seller findById(Long id) {
        return em.find(Seller.class, id);
    }

    public List<Seller> findAll() {
        return em.createQuery("select s from Seller s", Seller.class)
                .getResultList();
    }
}
