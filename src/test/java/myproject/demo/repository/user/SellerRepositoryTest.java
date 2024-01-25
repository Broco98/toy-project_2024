package myproject.demo.repository.user;

import lombok.extern.slf4j.Slf4j;
import myproject.demo.domain.user.Admin;
import myproject.demo.domain.user.Seller;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@SpringBootTest
@Transactional
class SellerRepositoryTest {

    @Autowired
    private SellerRepository sellerRepository;

    @Test
    void save() {
        // given
        Seller seller = new Seller("admin1234", "1111", "admin01", "01011111111", "판매자1", "저희는 좋은 유기농 제품만 판매합니다 :)", "고정 주소");
        log.info("save admin={}", seller);

        // when
        sellerRepository.save(seller);

        // then
        Seller findSeller = sellerRepository.findOne(seller.getId());
        log.info("find admin={}", findSeller);
        Assertions.assertThat(findSeller).isEqualTo(seller);
    }

}