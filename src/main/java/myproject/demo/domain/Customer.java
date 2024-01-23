package myproject.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@Entity @Getter
public class Customer extends User{

    // 잘 모르겠네 ㅇㅅ
    private User user;

    private String nickName;
}
