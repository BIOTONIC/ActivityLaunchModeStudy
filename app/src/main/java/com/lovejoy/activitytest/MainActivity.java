package com.lovejoy.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Click btnOne will open a website
        btnOne = (Button)findViewById(R.id.btnOne);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent();
                it.setAction(Intent.ACTION_VIEW);
                it.setData(Uri.parse("http://www.runoob.com/w3cnote/android-tutorial-intro.html"));
                startActivity(it);
            }
        });

        // Click btnTwo will open a standard activity
        btnTwo = (Button)findViewById(R.id.btnTwo);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent();
                it.setAction("SecondActivity");
                startActivity(it);
            }
        });

        // Click btnThree will open a singleTop activity
        btnThree = (Button)findViewById(R.id.btnThree);
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, SingleTopActivity.class);
                startActivity(it);
            }
        });

        // Click btnFour will open a singleTask activity
        btnFour = (Button)findViewById(R.id.btnFour);
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, SingleTaskActivity.class);
                startActivity(it);
            }
        });

        // Click btnFive will open a singleInstance activity
        btnFive = (Button)findViewById(R.id.btnFive);
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, SingleInstanceActivity.class);
                startActivity(it);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this,"MainActivity:onDestroy()",Toast.LENGTH_SHORT).show();
    }
}
