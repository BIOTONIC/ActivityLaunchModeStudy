package com.lovejoy.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingleInstanceActivity extends AppCompatActivity {

    private Button btnOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);

        btnOne = (Button)findViewById(R.id.btnOne);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(SingleInstanceActivity.this, SingleInstanceActivity.class);
                startActivity(it);
            }
        });
    }
}
