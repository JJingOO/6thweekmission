package com.cookandroid.a6thweekmission;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.cookandroid.doitmission_10.R;


public class MainActivity_08 extends Activity {
    EditText id;
    EditText pw;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_08);

        id = findViewById(R.id.idText);
        pw = findViewById(R.id.pwText);
        loginBtn = findViewById(R.id.button);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(id.getText().toString().equals("") || pw.getText().toString().equals("")){
                    Toast toast =  Toast.makeText(getApplicationContext(),"아이디와 비밀번호를 확인해주세요!",Toast.LENGTH_SHORT);
                    toast.show();
                }

                else{
                    Intent intent = new Intent(getApplicationContext(), MenuActivity_08.class);
                    intent.putExtra("id",id.getText().toString());
                    intent.putExtra("password",pw.getText().toString());
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}