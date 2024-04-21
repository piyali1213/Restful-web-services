package com.webservices.restfulwebservices.entity;

import java.time.LocalDate;

public class UserSocialMedia {

    private Integer UserId;
    private String name;
    private LocalDate birthDate;

    public UserSocialMedia(Integer userId, String name, LocalDate birthDate) {
        UserId = userId;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "UserSocialMedia{" +
                "UserId=" + UserId +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
