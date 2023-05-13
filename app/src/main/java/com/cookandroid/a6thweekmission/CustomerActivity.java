package com.cookandroid.a6thweekmission;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.cookandroid.doitmission_10.R;

public class CustomerActivity extends Activity {

    Button cMenuBtn;
    Button cMainBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        cMenuBtn = findViewById(R.id.menuBtn_c);
        cMainBtn = findViewById(R.id.mainBtn_c);

        cMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity_08.class);
                startActivity(intent);
                Toast toast =  Toast.makeText(getApplicationContext(),"고객 관리에서 넘어옴",Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }
        });

        cMainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity_08.class);
                startActivity(intent);
                Toast toast =  Toast.makeText(getApplicationContext(),"고객 관리에서 넘어옴",Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }
        });
    }
}