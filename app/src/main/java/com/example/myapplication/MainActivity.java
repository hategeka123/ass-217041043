package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userName, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName=(EditText)findViewById(R.id.userName);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=userName.getText().toString();
                String pass=password.getText().toString();
                if (user.equals("")|| pass.equals("")){
                    Toast.makeText(getApplicationContext(), "please enter userName",Toast.LENGTH_LONG).show();
                }
                else if (user==("Admin")&& pass==("1234")){
                    Toast.makeText(getApplicationContext(),"login successful", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, drower.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(getApplicationContext(), "imvalid userName || password", Toast.LENGTH_LONG).show();
            }
        });
    }
}
