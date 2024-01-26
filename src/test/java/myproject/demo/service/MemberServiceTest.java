package myproject.demo.service;

import myproject.demo.domain.member.Admin;
import myproject.demo.domain.member.Customer;
import myproject.demo.domain.member.Member;
import myproject.demo.domain.member.Seller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;


@Transactional
@SpringBootTest
class MemberServiceTest {

    @Autowired private MemberService memberService;

    @Test
    void join() {
        // given
        Customer customer = new Customer("id1", "1111", "admin01", "01011111111", "소비자1");
        Admin admin = new Admin("id2", "1111", "admin01", "01011111111", "관리자1");
        Seller seller = new Seller("id3", "1111", "admin01", "01011111111", "판매자1", "저희는 좋은 유기농 제품만 판매합니다 :)", "고정 주소");

        // when
        memberService.join(customer);
        memberService.join(admin);
        memberService.join(seller);

        // then
        Member findCustomer = memberService.findById(customer.getId());
        Member findSeller = memberService.findById(seller.getId());
        Member findAdmin = memberService.findById(admin.getId());
        assertThat(findCustomer.getId()).isEqualTo(customer.getId());
        assertThat(findSeller.getId()).isEqualTo(seller.getId());
        assertThat(findAdmin.getId()).isEqualTo(admin.getId());
    }

    @Test
    void join_duplicate() {
        // given
        Customer customer1 = new Customer("id1", "1111", "admin01", "01011111111", "소비자1");
        Customer customer2 = new Customer("id1", "1111", "admin01", "01011111111", "소비자1");

        // when
        memberService.join(customer1);

        // then
        assertThatThrownBy(() -> memberService.join(customer2)).isInstanceOf(IllegalStateException.class);
    }

}