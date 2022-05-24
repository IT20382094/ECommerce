package lk.backend.service;

import lk.backend.entity.CartDetail;
import lk.backend.entity.Item;
import lk.backend.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User login(User user);

    User signUp(User user);

    List<Item> getItems(String txt);

    Object addToCart(CartDetail cart);
}
