package myproject.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;


import java.time.LocalDateTime;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;                        // PK

    private String username;                // 아이디
    private String password;                // 비밀번호

    private String nickName;                // 별명
    private String phoneNumber;             // 전화번호

    @Enumerated(EnumType.STRING)
    private UserStatus status;              // 회원 상태

    private LocalDateTime joinDate;         // 가입일
    private LocalDateTime withdrawalDate;   // 탈퇴일
    private LocalDateTime suspensionDate;   // 정지일

}
