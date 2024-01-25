package myproject.demo.repository.user;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import myproject.demo.domain.user.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AdminRepository {

    private final EntityManager em;

    public Long save(Admin admin) {
        em.persist(admin);
        return admin.getId();
    }

    public Admin findOne(Long id) {
        return em.find(Admin.class, id);
    }


    public List<Admin> findAll() {
        return em.createQuery("select a from Admin a", Admin.class)
                .getResultList();
    }

}
