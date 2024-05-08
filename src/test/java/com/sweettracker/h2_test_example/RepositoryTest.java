package com.sweettracker.h2_test_example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
//@TestPropertySource("classpath:application-test.properties")
public class RepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    @DisplayName("[succeess] 개발 환경으로 구축한 h2 DB 정보를 정상적으로 조회하는지 확인한다.")
    void test () {
        // given
        String userId = "test";

        // when
        Optional<AccountEntity> test = accountRepository.findByUserId(userId);

        // then
        assertThat(test.isPresent()).isTrue();
        AccountEntity accountEntity = test.get();
        assertThat(accountEntity.getName()).isEqualTo("od");
    }
}
