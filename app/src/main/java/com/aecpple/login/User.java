package com.aecpple.login;

public class User {
    private String USERNAME;
    private String USER_ID;
    private String PASSWORD;
    private String USER_BIRTH;
    private String HANDICAP;

    public User(String USERNAME, String USER_ID,String PASSWORD,String USER_BIRTH,String HANDICAP) {
        this.USERNAME = USERNAME;
        this.USER_ID = USER_ID;
        this.PASSWORD = PASSWORD;
        this.USER_BIRTH = USER_BIRTH;
        this.HANDICAP = HANDICAP;
    }

    // Getter/Setter 필요 시 추가
}

