package com.unimedsci.edc.core.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: Sting
 * @created: 13-5-8 下午5:02
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public void setUserRepository(UserRepository repository) {
        this.userRepository = repository;
    }

    @Override
    public User findUserByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    @Override
    public User insertUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public void deleteUserById(int id) {
        User user = new User();
        user.setId(id);
        this.userRepository.delete(user);
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-infrastructure.xml",
                "applicationContext-user.xml");
        UserService service = (UserService)context.getBean("userService");
        User user = new User();
        user.setEmail("sting.hu@gmail.com");
        user.setPassword("qwe123");
        System.out.println("Begin to insert");
        User u = service.insertUser(user);
        System.out.println(u.getId());

        user = service.findUserByEmail("sting.hu@gmail.com");
        System.out.println(user.getId());

        service.deleteUserById(user.getId());
    }
}
