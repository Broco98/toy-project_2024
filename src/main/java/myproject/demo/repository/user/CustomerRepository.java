package myproject.demo.repository.user;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import myproject.demo.domain.user.Customer;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class CustomerRepository {

    private final EntityManager em;

    public Long save(Customer customer) {
        em.persist(customer);
        return customer.getId();
    }

    public Customer findOne(Long id) {
        return em.find(Customer.class, id);
    }

}