package com.xingkong.springdatajpa.repository;

import com.xingkong.springdatajpa.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author kk
 * @date 2019-11-02 17:10
 */
public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
