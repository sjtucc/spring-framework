package org.springframework.test.aop.jdk;

public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
    }

    @Override
    public String getName(int id) {
        System.out.println("---getName---");
        return "John";
    }

    @Override
    public Integer getAge(int id) {
        System.out.println("---getAge---");
        return 10;
    }

}