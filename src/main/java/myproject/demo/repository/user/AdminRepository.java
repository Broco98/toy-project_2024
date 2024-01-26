package myproject.demo.repository.user;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import myproject.demo.domain.member.Admin;
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

    public Admin findById(Long id) {
        return em.find(Admin.class, id);
    }


    public List<Admin> findAll() {
        return em.createQuery("select a from Admin a", Admin.class)
                .getResultList();
    }

}
