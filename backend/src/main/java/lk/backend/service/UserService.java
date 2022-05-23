package lk.backend.service;

import lk.backend.entity.User;

public interface UserService {

    User login(User user);

    User signUp(User user);
}
