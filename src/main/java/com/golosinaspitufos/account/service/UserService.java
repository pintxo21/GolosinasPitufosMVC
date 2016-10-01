package com.golosinaspitufos.account.service;

import com.golosinaspitufos.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
