package com.cc.tspring.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {

    @JsonProperty("user_name")
    private String userName;

    private int age;

    private String email;

    private String phone;

    private String skill;

    @JsonProperty("introduce")
    private String others;

}
