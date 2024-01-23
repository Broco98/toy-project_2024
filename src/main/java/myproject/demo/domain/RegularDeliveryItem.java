package myproject.demo.domain;

import jakarta.persistence.*;

@Entity
public class RegularDeliveryItem {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id") // 이거 어떤걸로 설정해야 하는지 기억이 안남...
    private RegularDeliveryInfo deliveryInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Item item;

    private Integer price;
    private Integer quantity;

}
