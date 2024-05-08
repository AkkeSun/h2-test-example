DROP TABLE IF EXISTS TBL_ACCOUNT;
create table TBL_ACCOUNT
(
    TABLE_INDEX     int auto_increment
        primary key,
    USER_ID         varchar(50)  not null,
    PASSWORD        varchar(150) null,
    NAME            varchar(50)  not null,
    PHONE_NUMBER    varchar(50)  null,
    ADDRESS         varchar(150) null,
    ROLE            varchar(50)  null,
    REG_DATE        varchar(10)  null,
    LAST_LOGIN_TIME datetime     null,
    SNS_SECRET      varchar(150) null,
    SNS_SYNC        varchar(10)  null,
    constraint TBL_ACCOUNT_uk
        unique (USER_ID)
);
