package myproject.demo.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class CreateMemberForm {

    private String username;
    private String password;
    private String name;
    private String phoneNumber;

}
