package com.sabel;

public class LoginService {

    public boolean checkPassword(String name, String passsword) {
        if (name.length() == 0 || passsword.length() == 0) {
            return false;
        }
        return (name.toLowerCase().equals(passsword));
    }

}
