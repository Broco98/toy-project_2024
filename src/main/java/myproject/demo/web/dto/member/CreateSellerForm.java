package myproject.demo.web.dto.member;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateSellerForm extends CreateMemberForm{

    private String businessName;
    private String businessInfo;
    private String address;
}
