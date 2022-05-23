package lk.backend.service;

import lk.backend.entity.Item;
import lk.backend.entity.User;

import java.util.List;

public interface UserService {

    User login(User user);

    User signUp(User user);

    List<Item> getItems(String txt);
}
