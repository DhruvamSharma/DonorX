package com.saverx.rushabh.saverx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeightDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_details);

        Button WeightOk=(Button)findViewById(R.id.Weightok);

        WeightOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent weight=new Intent(WeightDetails.this,LocationDetails.class);
                startActivity(weight);
            }
        });
    }
}
