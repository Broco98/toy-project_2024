package myproject.demo.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class DeliveryInfo {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "orders_id")
    private Order order;

    private String deliveryCompanyInfo;
    private LocalDateTime expectedDeliveryDate;
    private DeliveryStatus status;


}
