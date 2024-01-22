package myproject.demo.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime orderDate;
    private Long expectedDeliveryDate;
    private LocalDate refundDate;
    private String refundReason;

    private String zipCode;                     // 우편 번호
    private String detailAddress;               // 상세 주소
    private String recipientName;               // 받는분 성함
    private String recipientPhoneNumber;        // 받는분 전화번호
    private String instructions;                // 요청사항
    private String additionalDeliveryInfo;       // 배송 추가 정보

    private Long totalPaymentAmount;
    private Long numberOfOrderedItems;
    private String paymentInfo;




}
