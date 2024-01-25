package myproject.demo.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAdminForm extends CreateMemberForm{

    private String nickName;
}
