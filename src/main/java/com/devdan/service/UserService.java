package com.devdan.service;

import com.devdan.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
