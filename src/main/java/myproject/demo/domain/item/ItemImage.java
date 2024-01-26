package myproject.demo.domain.item;

import jakarta.persistence.*;
import lombok.Getter;

@Entity @Getter
public class ItemImage {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    private Integer sequence;

    private String fileName;

    private String storeURL;

}
