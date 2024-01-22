package myproject.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class Seller {

    @Id
    @GeneratedValue
    @Column(name = "seller_id")
    private Long id;

    private String username;
    private String password;

    private String name;
    private String shopName;
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private UserStatus status;



    private LocalDateTime joinDate;         // 가입일
    private LocalDateTime withdrawalDate;   // 탈퇴일
    private LocalDateTime suspensionDate;   // 정지일

}
