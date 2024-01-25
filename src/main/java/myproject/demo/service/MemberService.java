package myproject.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import myproject.demo.domain.user.Admin;
import myproject.demo.domain.user.Customer;
import myproject.demo.domain.user.Seller;
import myproject.demo.repository.user.AdminRepository;
import myproject.demo.repository.user.CustomerRepository;
import myproject.demo.repository.user.SellerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final CustomerRepository customerRepository;
    private final AdminRepository adminRepository;
    private final SellerRepository sellerRepository;

    @Transactional
    public Long join(Customer customer) {
        return customerRepository.save(customer);
    }

    @Transactional
    public Long join(Admin admin) {
        return adminRepository.save(admin);
    }

    @Transactional
    public Long join(Seller seller) {
        return sellerRepository.save(seller);
    }



}
