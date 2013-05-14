package com.unimedsci.edc.core.user;

import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @author: Sting
 * @created: 13-5-8 下午4:47
 */
public interface UserRepository extends Repository<User, Integer> {
    User findByEmail(String email);
    User save(User user);
    List<User> findAll();
    void delete(User id);
}
