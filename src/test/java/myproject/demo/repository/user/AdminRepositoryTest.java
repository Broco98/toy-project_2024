package myproject.demo.repository.user;

import lombok.extern.slf4j.Slf4j;
import myproject.demo.domain.member.Admin;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@SpringBootTest
@Transactional
class AdminRepositoryTest {

    @Autowired private AdminRepository adminRepository;

    @Test
    void save() {
        // given
        Admin admin = new Admin("admin1234", "1111", "admin01", "01011111111", "관리자1");
        log.info("save admin={}", admin);

        // when
        adminRepository.save(admin);

        // then
        Admin findAdmin = adminRepository.findById(admin.getId());
        log.info("find admin={}", findAdmin);
        Assertions.assertThat(findAdmin).isEqualTo(admin);
    }

}