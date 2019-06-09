package com.cookandroid.jokeproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Settings  extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        Button button1 = (Button) findViewById(R.id.setting1);
        Button button2 = (Button) findViewById(R.id.buttonClose);
        Button button3 = (Button) findViewById(R.id.CloseAll);
        button1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(getApplicationContext(), "버튼을 눌렀어요", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });

        button3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                finishAffinity();
                    System.runFinalization();
                    System.exit(0);
            }
        });

    }


}
