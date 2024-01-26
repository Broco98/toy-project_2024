package myproject.demo.api;

import lombok.RequiredArgsConstructor;
import myproject.demo.domain.member.Admin;
import myproject.demo.domain.member.Customer;
import myproject.demo.domain.member.Seller;
import myproject.demo.service.MemberService;
import myproject.demo.web.dto.member.CreateAdminForm;
import myproject.demo.web.dto.member.CreateCustomerForm;
import myproject.demo.web.dto.member.CreateSellerForm;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequiredArgsConstructor
public class MemberApiController {

    private final MemberService memberService;

    @PostMapping("/api/members/customer/join")
    public Customer customerJoin(CreateCustomerForm form) {

        Customer customer = new Customer(
                form.getUsername(),
                form.getPassword(),
                form.getName(),
                form.getPhoneNumber(),
                form.getNickName()
        );

        memberService.join(customer);
        return customer;
    }

    @PostMapping("/api/members/admin/join")
    public Admin adminJoin(CreateAdminForm form) {

        Admin admin = new Admin(
                form.getUsername(),
                form.getPassword(),
                form.getName(),
                form.getPhoneNumber(),
                form.getNickName()
        );

        memberService.join(admin);
        return admin;
    }

    @PostMapping("/api/members/seller/join")
    public Seller sellerJoin(CreateSellerForm form) {

        Seller seller = new Seller(
                form.getUsername(),
                form.getPassword(),
                form.getName(),
                form.getPhoneNumber(),
                form.getBusinessName(),
                form.getBusinessInfo(),
                form.getAddress()
        );

        memberService.join(seller);
        return seller;
    }

}
