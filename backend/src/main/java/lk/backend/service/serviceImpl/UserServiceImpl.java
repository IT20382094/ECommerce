package lk.backend.service.serviceImpl;

import lk.backend.entity.User;
import lk.backend.repository.UserRepository;
import lk.backend.service.UserService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;

class UserSerivceImpl implements UserService {
    @Autowired
    private UserRepository userRepositotory;

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
}


