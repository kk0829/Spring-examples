package com.xingkong.springdatajpa.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author kk
 * @date 2019-11-02 17:44
 */
@Data
public class ApplicationUpdateDTO {
    @NotNull
    private Integer id;

    private String name;

    private String description;
}
