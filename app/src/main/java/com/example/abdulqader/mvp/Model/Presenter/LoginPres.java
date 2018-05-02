package com.example.abdulqader.mvp.Model.Presenter;

import com.example.abdulqader.mvp.Model.User;
import com.example.abdulqader.mvp.View.LoginView;

public class LoginPres implements LoginPre{

    LoginView loginView;
    public LoginPres(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void Login(String email, String pass) {

        User user= new User(email,pass);

        boolean success= user.isValid();

        if(success)
        {
            loginView.result("success");
        }
        else
        {
            loginView.result("failed");
        }

    }
}
