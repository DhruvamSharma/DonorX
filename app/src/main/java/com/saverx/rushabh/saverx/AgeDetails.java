package com.saverx.rushabh.saverx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgeDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_details);
    Button AgeOk=(Button)findViewById(R.id.ok);

    AgeOk.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent AgeIntent=new Intent(AgeDetails.this,GenderDetails.class);
            startActivity(AgeIntent);
        }
    });

    }
}
