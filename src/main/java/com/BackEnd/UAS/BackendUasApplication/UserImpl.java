package com.BackEnd.UAS.BackendUasApplication;

import com.BackEnd.UAS.BackendUasApplication.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements userService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User insertUser(User user) {
        User userResult = new User();
        userResult.setUsername(user.getUsername());
        userResult.setPassword(user.getPassword());
        User userRepo = userRepository.save(userResult);
        return userRepo;
    }
}
