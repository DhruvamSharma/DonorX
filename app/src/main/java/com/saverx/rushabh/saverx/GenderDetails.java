package com.saverx.rushabh.saverx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GenderDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_details);

        Button WeightOk=(Button)findViewById(R.id.SexOk);

        WeightOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent weight=new Intent(GenderDetails.this,WeightDetails.class);
                startActivity(weight);
            }
        });
    }
}
