package com.xingkong.example.mongo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author wanggan
 * @create 2019-03-16 22:32
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class User {

    private Integer id;

    private String username;

    private Integer age;
}
