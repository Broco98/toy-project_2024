package myproject.demo.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import myproject.demo.domain.item.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepository {

    private final EntityManager em;

    public Item save(Item item) {
        em.persist(item);
        return item;
    }

    public Item findById(Long id) {
        return em.find(Item.class, id);
    }

    public List<Item> findAll() {
        return em.createQuery("select i from Item i", Item.class)
                .getResultList();
    }

}
