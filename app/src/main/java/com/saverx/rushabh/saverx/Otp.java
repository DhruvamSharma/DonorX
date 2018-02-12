package com.saverx.rushabh.saverx;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Otp extends AppCompatActivity {


  /*  public Otp() {
        // Required empty public constructor
    }*/


  /*  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_otp, container, false);
    }
*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_otp);

        Button Okay=(Button)findViewById(R.id.otpOk);

        Okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bloodGroup=new Intent(Otp.this,BloodGroupDetails.class);
                startActivity(bloodGroup);
            }
        });


    }
}
