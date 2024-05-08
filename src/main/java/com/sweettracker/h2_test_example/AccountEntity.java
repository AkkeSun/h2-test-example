package com.sweettracker.h2_test_example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor
@Table(name = "TBL_ACCOUNT")
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TABLE_INDEX")
    private Long id;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "SNS_SYNC")
    private String snsSync;

    @Column(name = "SNS_SECRET")
    private String snsSecret;

    @Column(name = "REG_DATE")
    private String regDate;

    @Column(name = "LAST_LOGIN_TIME")
    private LocalDateTime lastLoginTime;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Builder
    public AccountEntity(Long id, String userId, String password, String name, String phoneNumber,
        String address, String snsSync, String snsSecret, String regDate,
        LocalDateTime lastLoginTime,
        Role role) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.snsSync = snsSync;
        this.snsSecret = snsSecret;
        this.regDate = regDate;
        this.lastLoginTime = lastLoginTime;
        this.role = role;
    }
}
