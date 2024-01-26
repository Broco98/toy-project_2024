package myproject.demo.domain.item;

import jakarta.persistence.*;
import lombok.Getter;
import myproject.demo.domain.BasicDate;
import myproject.demo.domain.member.Seller;

import java.util.ArrayList;
import java.util.List;

@Entity @Getter
public class Item{

    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Seller seller;

    private Integer salesQuantityGram;
    private Integer salesQuantityNum;

    private Integer originalPrice;
    private Integer salesPrice;
    private Integer stock;

    @Enumerated(EnumType.STRING)
    private ItemStatus status;

    private String description;

    private Integer likes;
    private Integer views;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    private List<ItemMarker> markers = new ArrayList<>();

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
    private List<ItemHashTag> hashTags = new ArrayList<>();

    @Embedded
    private BasicDate date;


    public Item(Seller seller, Integer salesQuantityGram, Integer salesQuantityNum, Integer originalPrice, Integer stock, ItemStatus status, String description, Integer likes, Integer views) {
        this.seller = seller;
        this.salesQuantityGram = salesQuantityGram;
        this.salesQuantityNum = salesQuantityNum;
        this.originalPrice = originalPrice;
        this.stock = stock;
        this.status = status;
        this.description = description;
        this.likes = likes;
        this.views = views;
    }
}
