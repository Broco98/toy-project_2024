package myproject.demo.domain;

import jakarta.persistence.*;

@Entity
public class UserAddress {

    @Id
    @GeneratedValue
    @Column(name = "user_address_id")
    private Long userAddressId;         // pk

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;                          // fk: 사용자

    private String zipCode;                     // 우편 번호
    private String additionalInformation;       // 상세 정보
    private String recipientName;               // 받는분 성함
    private String recipientPhoneNumber;        // 받는분 전화번호
    private Boolean isDefaultDeliveryAddress;   // 기본 배송지 여부
    private String instructions;                // 요청사항


}
