package com.qf.vo;

import lombok.Data;

/**
 * Created by DELL on 2019/8/8.
 */
@Data
public class ThymeleafUserInfoVO {
    String name;
    String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
