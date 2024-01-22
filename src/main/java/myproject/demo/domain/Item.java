package myproject.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
@Getter
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id")
    private Seller seller;

    private Long saleQuantity;
    private Long saleQuantityGram;

    private Long price;
    private Long stock;

    private String description;
    private ItemStatus status;
    private Long viewCount;

    private LocalDateTime registrationDate;
    private LocalDateTime deletionDate;
    private LocalDateTime modificationDate;

}
