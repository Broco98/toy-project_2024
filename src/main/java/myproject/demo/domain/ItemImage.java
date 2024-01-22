package myproject.demo.domain;

import jakarta.persistence.*;

@Entity
public class ItemImage {

    @Id
    @GeneratedValue
    @Column(name = "itemimage_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private Integer order;
    private String fileName;
    private String dbURL;

}
