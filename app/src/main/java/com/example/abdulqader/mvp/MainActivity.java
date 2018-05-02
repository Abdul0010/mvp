package com.example.abdulqader.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.abdulqader.mvp.Model.Presenter.LoginPres;
import com.example.abdulqader.mvp.View.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView {
    private EditText email,pass;
    private Button login;
    LoginPres pres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=(EditText)findViewById(R.id.email);
        pass =(EditText)findViewById(R.id.password);
        login= (Button)findViewById(R.id.login);

        pres= new LoginPres(this);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pres.Login(email.getText().toString(),pass.getText().toString());

            }
        });
    }

    @Override
    public void result(String result) {
        Toast.makeText(this,result,Toast.LENGTH_SHORT).show();

    }
}
