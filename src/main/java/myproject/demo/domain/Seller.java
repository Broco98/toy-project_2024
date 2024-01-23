package myproject.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity @Getter
public class Seller extends User{
    
    // 잘 모르겠네 ㅇㅅ
    private User user;

    private String businessName;
    private String businessInfo;
    private String address;
    private Integer likeNum;

}
