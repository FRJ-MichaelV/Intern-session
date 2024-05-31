package com.firstapp.mvcexample1;

import org.springframework.stereotype.Service;

// class having business logic
@Service
public class LoginService {
    public boolean validateUser(String userid, String password){
        return userid.equalsIgnoreCase("jbk")
                && password.equalsIgnoreCase("jbk");
    }
}
