package com.cookandroid.a6thweekmission;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.cookandroid.doitmission_10.R;

public class SalesActivity extends Activity {
    Button sMenuBtn;
    Button sMainBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);

        sMenuBtn = findViewById(R.id.menuBtn_s);
        sMainBtn = findViewById(R.id.mainBtn_s);

        sMenuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity_08.class);
                startActivity(intent);
                Toast toast =  Toast.makeText(getApplicationContext(),"매출 관리에서 넘어옴",Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }
        });

        sMainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity_08.class);
                startActivity(intent);
                Toast toast =  Toast.makeText(getApplicationContext(),"매출 관리에서 넘어옴",Toast.LENGTH_SHORT);
                toast.show();
                finish();
            }
        });
    }
}