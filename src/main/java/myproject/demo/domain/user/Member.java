package myproject.demo.domain.user;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@Entity @Getter
@Setter(AccessLevel.PROTECTED)
@Inheritance(strategy = InheritanceType.JOINED)
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String username;
    private String password;

    private String name;
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;

    private LocalDateTime joinDate;         // 가입일
    private LocalDateTime withdrawalDate;   // 탈퇴일
    private LocalDateTime stopDate;         // 정지일

}
