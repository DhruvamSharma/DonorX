package com.saverx.rushabh.saverx;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.getbase.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

/**
 * Created by Rushabh-PC on 18-06-2017.
 */
public class Login extends Fragment {
    View view;
    int positionnew = 0;
    TextView pass;
    ImageView eye;
    int revealFlag=0;

    public Login() {
        //super(fm);
    }



  /*  public Login(String company_name){


    }*/


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            positionnew = bundle.getInt("position", 0);
        }

        view = inflater.inflate(R.layout.login, container, false);
        eye=(ImageView)view.findViewById(R.id.image_eye);
        pass=(TextView)view.findViewById(R.id.editpasswd);


        eye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (revealFlag == 0) {
                    eye.setImageResource(R.drawable.ic_visibility_off_black_24dp);

                    pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    revealFlag = 1;

                } else {
                    eye.setImageResource(R.drawable.ic_remove_red_eye_black_24dp);
                    revealFlag = 0;
                    pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
               // pass.setSelection(pass.getText().length());

            }
        });




        final Button Login=(Button)view.findViewById(R.id.buttonlogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"I am Login",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getActivity(),NavigationDrawer.class);
                startActivity(intent);

            }
        });





//service request

        return view;
    }




}
