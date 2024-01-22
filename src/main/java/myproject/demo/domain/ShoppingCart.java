package myproject.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class ShoppingCart {

    @Id
    @GeneratedValue
    @Column(name = "shopping_card_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;


}
