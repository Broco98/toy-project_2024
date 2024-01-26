package myproject.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import myproject.demo.domain.member.Admin;
import myproject.demo.domain.member.Customer;
import myproject.demo.domain.member.Member;
import myproject.demo.domain.member.Seller;
import myproject.demo.repository.user.AdminRepository;
import myproject.demo.repository.user.CustomerRepository;
import myproject.demo.repository.user.MemberRepository;
import myproject.demo.repository.user.SellerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final CustomerRepository customerRepository;
    private final AdminRepository adminRepository;
    private final SellerRepository sellerRepository;
    private final MemberRepository memberRepository;


    @Transactional
    public Long join(Customer customer) {
        isValid(customer);
        return customerRepository.save(customer);
    }

    @Transactional
    public Long join(Admin admin) {
        isValid(admin);
        return adminRepository.save(admin);
    }

    @Transactional
    public Long join(Seller seller) {
        isValid(seller);
        return sellerRepository.save(seller);
    }


    // 지금은 username 중복만 제외
    private void isValid(Member member) {
        List<Member> findMembers = memberRepository.findByName(member.getUsername());
        if (!findMembers.isEmpty()) {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    public Member findById(Long id) {
        return memberRepository.findById(id);
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

}
