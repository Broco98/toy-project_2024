package myproject.demo.repository.user;

import lombok.extern.slf4j.Slf4j;
import myproject.demo.domain.member.Customer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@SpringBootTest
@Transactional
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void save() {
        // given
        Customer customer = new Customer("admin1234", "1111", "admin01", "01011111111", "소비자1");
        log.info("save admin={}", customer);

        // when
        customerRepository.save(customer);

        // then
        Customer findCustomer = customerRepository.findById(customer.getId());
        log.info("find admin={}", findCustomer);
        Assertions.assertThat(findCustomer).isEqualTo(customer);
    }

}