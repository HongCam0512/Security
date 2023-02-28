package com.cybersoft.osahaneat.service;

import com.cybersoft.osahaneat.entity.Users;
import com.cybersoft.osahaneat.repository.UserRepository;
import com.cybersoft.osahaneat.service.imp.LoginServiceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService implements LoginServiceimp {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean login(String username, String password) {

       // return userRepository.findByEmailAndPassword(username, password).size() > 0;// viet tac
        List<Users> listUsers = userRepository.findByEmailAndPassword(username, password);
        return listUsers.size() > 0;
    }
}
