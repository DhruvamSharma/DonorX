package com.saverx.rushabh.saverx;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


import com.getbase.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

/**
 * Created by Rushabh-PC on 18-06-2017.
 */
public class Login extends Fragment {
    View view;
    int positionnew = 0;


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
