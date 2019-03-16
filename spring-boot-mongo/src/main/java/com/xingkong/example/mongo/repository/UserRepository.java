package com.xingkong.example.mongo.repository;

import com.xingkong.example.mongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author wanggan
 * @create 2019-03-16 22:35
 */
public interface UserRepository extends MongoRepository<User, Integer> {

}
