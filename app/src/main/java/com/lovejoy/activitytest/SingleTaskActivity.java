package com.lovejoy.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingleTaskActivity extends AppCompatActivity {

    private Button btnOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signle_task);

        btnOne = (Button)findViewById(R.id.btnOne);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(SingleTaskActivity.this, SingleTaskActivity.class);
                startActivity(it);
            }
        });
    }
}
