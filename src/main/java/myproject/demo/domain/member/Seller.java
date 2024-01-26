package myproject.demo.domain.member;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity @Getter  @NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Seller extends Member{

    private String businessName;
    private String businessInfo;
    private String address;
    private Integer likeNum;

    public Seller(String username, String password, String name, String phoneNumber, String businessName, String businessInfo, String address) {
        setUsername(username);
        setPassword(password);
        setName(name);
        setPhoneNumber(phoneNumber);
        setStatus(MemberStatus.ACTIVATE);
        setJoinDate(LocalDateTime.now());
        setWithdrawalDate(null);
        setStopDate(null);

    }

}
