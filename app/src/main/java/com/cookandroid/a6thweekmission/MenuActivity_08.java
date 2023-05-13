package com.cookandroid.a6thweekmission;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.cookandroid.doitmission_10.R;

public class MenuActivity_08 extends Activity {
    Button customButton;
    Button salesButton;
    Button mdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        customButton = findViewById(R.id.button1);
        salesButton = findViewById(R.id.button2);
        mdButton = findViewById(R.id.button3);


        Intent intent = new Intent();
        intent = getIntent();
        String id = intent.getStringExtra("id");
        String password = intent.getStringExtra("password");

        if(id != null)
        {
            Toast toast =
                    Toast.makeText(getApplicationContext(),id +"님 환영합니다!",Toast.LENGTH_LONG);
            toast.show();
        }


        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CustomerActivity.class);
                startActivity(intent);
                finish();
            }
        });

        salesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SalesActivity.class);
                startActivity(intent);
                finish();
            }
        });

        mdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ItemActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}