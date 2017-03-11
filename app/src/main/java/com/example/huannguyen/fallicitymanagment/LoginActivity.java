package com.example.huannguyen.fallicitymanagment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button login;                       //Initialized Button variable
    EditText edUsername;               //Initialized EditText variable (type string/int) that we use
    EditText edPassword;               //Initialized EditText Variable
    String username;                   //Initialized String Variable that will be temp object for getting EditText
    String password;                   //Initialized String Variable
    TextView viewManagerUser;         //Initialized TextView Variable that will display manager user
    TextView viewEmployeeUser;        //Initialized TextView Variable that will display employee user



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.Loginbutton);
        edUsername = (EditText) findViewById(R.id.editUsername);
        edPassword = (EditText) findViewById(R.id.editPassword);
        //viewEmployeeUser = (TextView) findViewById(R.id.TextViewEmployeeUserName);
        //viewManagerUser = (TextView) findViewById(R.id.TextViewManagerUserName);


        login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View login) {

                //editText variable convert to String variable.
                username = edUsername.getText().toString();
                password = edPassword.getText().toString();

                //Using "if statement", access into two different Activities
                // 1. This is the prototype Login UI without using Database
                // 2. We used temporary two Users, IDs and Passwords to make sure it works
                // 3. .equals(" ") is for string
                // 4. Toast.makeText represents an announcement as you access the specific activity page
                // 5. Manager access' ID and PW will be "manager" and "456" AND Employee access' ID and PW will be "employee and "123"
                // 6. other than these ID and PW will be denied to access these two activities
                if (username.equals("employee") && password.equals("123"))
                {

                    startActivity(new Intent(LoginActivity.this, EmpBuilding.class));
                    Toast.makeText(LoginActivity.this, "Accessed Employee Page", Toast.LENGTH_SHORT).show();
                }
                else if(username.equals("manager") && password.equals("456"))
                {

                    startActivity(new Intent(LoginActivity.this, ManBuilding.class));

                    Toast.makeText(LoginActivity.this, "Accessed Manager Page", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    startActivity(new Intent(LoginActivity.this, LoginActivity.class));
                    Toast.makeText(LoginActivity.this, "Access is denied", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
