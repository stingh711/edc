package com.unimedsci.edc.core.user;

import java.util.List;

/**
 * @author: Sting
 * @created: 13-5-8 下午4:59
 */
public interface UserService {
    User findUserByEmail(String email);
    User insertUser(User user);
    List<User> findAllUsers();
    User updateUser(User user);
    void deleteUserById(int id);
}
