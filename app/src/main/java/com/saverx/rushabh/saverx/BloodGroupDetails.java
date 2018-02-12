package com.saverx.rushabh.saverx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BloodGroupDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_group_details);

        Button buttonOkay=(Button)findViewById(R.id.Buttonok);

        buttonOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent okaybutton=new Intent(BloodGroupDetails.this,AgeDetails.class);
                startActivity(okaybutton);
            }
        });

    }
}
