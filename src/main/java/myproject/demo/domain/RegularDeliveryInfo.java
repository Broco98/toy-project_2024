package myproject.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity @Getter
public class RegularDeliveryInfo {

    @Id @GeneratedValue
    @Column(name = "regular_delivery_id")
    private Long id;

    @Embedded
    private AddressInfo addressInfo;

    private Integer paymentDay;
    private Integer deliveryDay;

    @Enumerated(EnumType.STRING)
    private RegularDeliveryStatus status;

    private LocalDateTime startDate;
    private Integer totalPrice;
    private Integer totalQuantity;
    private String paymentInfo;
    
    // 생성일 수정일 삭제일

}
