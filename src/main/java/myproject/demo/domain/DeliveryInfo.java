package myproject.demo.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class DeliveryInfo {

    @Id
    @GeneratedValue
    @Column(name = "deliveryinfo_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private LocalDateTime expectedDeliveryDate;
    private DeliveryStatus status;


}
