package com.zoe.mysql.entity;

import lombok.Data;

/**
 * @author zhaoccf
 * @version 1.0.0
 * @description 实体类
 * @date 2022/11/3 15:15
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
