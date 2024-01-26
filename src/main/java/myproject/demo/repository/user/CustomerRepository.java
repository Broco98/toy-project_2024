package myproject.demo.repository.user;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import myproject.demo.domain.member.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CustomerRepository {

    private final EntityManager em;

    public Long save(Customer customer) {
        em.persist(customer);
        return customer.getId();
    }

    public Customer findById(Long id) {
        return em.find(Customer.class, id);
    }

    public List<Customer> findAll() {
        return em.createQuery("select c from Customer c", Customer.class)
                .getResultList();
    }

}
