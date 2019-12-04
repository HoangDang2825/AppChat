package com.example.appchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editUser, editPassWord;
    Button buttonRegister, buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mapping();
    }

    private void Mapping() {
        editUser = (EditText)findViewById(R.id.edittextuser);
        editPassWord = (EditText)findViewById(R.id.edittextpasswword);
        buttonLogin= (Button)findViewById(R.id.buttondangnhap);
        buttonLogin.setOnClickListener(new Button.OnClickListener(){
            public  void onClick(View v){
                Intent intent = new Intent(MainActivity.this, FirstView.class);
                startActivity(intent);

            }
        });
        buttonRegister= (Button)findViewById(R.id.buttondangki);
        buttonRegister.setOnClickListener(new Button.OnClickListener(){
            public  void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent);
                finish();

            }
        });
    }
}
