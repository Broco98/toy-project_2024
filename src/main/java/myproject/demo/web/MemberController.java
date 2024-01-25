package myproject.demo.web;

import lombok.RequiredArgsConstructor;
import myproject.demo.domain.user.Admin;
import myproject.demo.domain.user.Customer;
import myproject.demo.domain.user.Seller;
import myproject.demo.service.MemberService;
import myproject.demo.web.dto.CreateAdminForm;
import myproject.demo.web.dto.CreateCustomerForm;
import myproject.demo.web.dto.CreateSellerForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/members/customer/join")
    public String customerForm() {
        return "members/customer/join";
    }

    @GetMapping("/members/admin/join")
    public String adminForm() {
        return "members/admin/join";
    }

    @GetMapping("/members/seller/join")
    public String sellerForm() {
        return "members/seller/join";
    }

    @PostMapping("/members/customer/join")
    public String customerJoin(CreateCustomerForm form, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if(bindingResult.hasErrors()) {
           return "members/customer/join";
        }

        Customer customer = new Customer(
                form.getUsername(),
                form.getPassword(),
                form.getName(),
                form.getPhoneNumber(),
                form.getNickName()
        );

        memberService.join(customer);
        redirectAttributes.addAttribute("join", "성공!");
        return "redirect:/members/login";
    }

    @PostMapping("/members/admin/join")
    public String adminJoin(CreateAdminForm form, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if(bindingResult.hasErrors()) {
            return "members/admin/join";
        }

        Admin admin = new Admin(
                form.getUsername(),
                form.getPassword(),
                form.getName(),
                form.getPhoneNumber(),
                form.getNickName()
        );

        memberService.join(admin);
        redirectAttributes.addAttribute("join", "성공!");
        return "redirect:/members/login";
    }

    @PostMapping("/members/seller/join")
    public String sellerJoin(CreateSellerForm form, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if(bindingResult.hasErrors()) {
            return "members/seller/join";
        }

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
        redirectAttributes.addAttribute("join", "성공!");
        return "redirect:/members/login";
    }

}
