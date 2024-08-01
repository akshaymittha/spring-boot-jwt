package com.example.service;

import com.example.entity.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<Users> store = new ArrayList<>();

    public UserService() {
        store.add(new Users(UUID.randomUUID().toString(), "akshay", "akshay@ai"));
        store.add(new Users(UUID.randomUUID().toString(), "kim", "kim@ai"));
        store.add(new Users(UUID.randomUUID().toString(), "jack", "jack@ai"));
    }

    public List<Users> getUsers() {
        return this.store;
    }
}
