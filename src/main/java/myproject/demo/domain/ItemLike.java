package myproject.demo.domain;

import jakarta.persistence.*;
import org.hibernate.mapping.Join;

@Entity
public class ItemLike {

    @Id
    @GeneratedValue
    @Column(name = "item_like_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

}
