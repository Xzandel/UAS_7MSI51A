package com.BackEnd.UAS.BackendUasApplication;
import com.BackEnd.UAS.BackendUasApplication.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Member;

@RestController
public class UserController {
    @Autowired
    private userService  userServ;

    @PostMapping("/register")
    public ResponseEntity<User> insertUser(@RequestBody  User user){
        return new ResponseEntity<User>(userServ.insertUser(user), HttpStatus.CREATED);
    }
}
