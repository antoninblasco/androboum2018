package com.example.admin.androboum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonDemarrer = findViewById(R.id.buttonDemarrer);

        buttonDemarrer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                lancerUser();
            }
        });
    }

    public void lancerUser() {
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }


}
