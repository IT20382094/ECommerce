package lk.backend.service.serviceImpl;

import lk.backend.entity.Item;
import lk.backend.entity.User;
import lk.backend.repository.ItemRepository;
import lk.backend.repository.UserRepository;
import lk.backend.service.UserService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

class UserSerivceImpl implements UserService {
    @Autowired
    private UserRepository userRepositotory;

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public User login(User user){
        byte[] encodedBytes = Base64.encodeBase64(user.getPassword().getBytes());
        user.setPassword(new String(encodedBytes));
        User userObj = userRepositotory.findByEmailAndPassword(user.getEmail(), user.getPassword());
        return new User(userObj);
    }

    @Override
    public User signUp(User user) {
        byte[] encodedBytes = Base64.encodeBase64(user.getPassword().getBytes());
        user.setPassword(new String(encodedBytes));
        User userobj = new User(userRepositotory.save(user));
        user.setPassword(null);
        return userobj;
    }

    @Override
    public List<Item> getItems(String txt) {
        List<Item> items;
        if (txt.equals("undefined")) {
            items = itemRepository.findAll();
        } else {
            items = itemRepository.findAllByCategory(txt);
        }
        List<Item> itemObj = new ArrayList<>();
        for (Item item : items) {
            itemObj.add(new Item(item));
        }
        return itemObj;
    }


}


