package com.example.abdulqader.mvp.Model;

public class User implements UserInterface {

    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValid() {
        if(email.equals("abdul")&&password.equals("1234"))
        {
            return true;
        }
        else {
            return false;
        }
    }
}
