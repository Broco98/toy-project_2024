package myproject.demo.domain.user;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity @Getter @NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Admin extends Member{

    private String nickName;

    public Admin(String username, String password, String name, String phoneNumber, String nickName) {
        setUsername(username);
        setPassword(password);
        setName(name);
        setPhoneNumber(phoneNumber);
        setStatus(MemberStatus.ACTIVATE);
        setJoinDate(LocalDateTime.now());
        setWithdrawalDate(null);
        setStopDate(null);
        this.nickName = nickName;
    }
}
