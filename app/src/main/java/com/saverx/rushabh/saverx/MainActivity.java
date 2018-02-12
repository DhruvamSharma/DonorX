package com.saverx.rushabh.saverx;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.TabLayout;
import android.view.ViewGroup;


public class MainActivity extends AppCompatActivity {


    View view;
    private static final String ARG_SECTION_NUMBER = "section_number";
  //  ViewPager viewPager;
    //TabLayout tabLayout;
    TabLayout tabLayout;
    LayoutInflater inflater;
    ViewGroup container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         this.container=container;
         this.inflater=inflater;
//        this.view= inflater.inflate(R.layout.activity_main, container, false);
        final ViewPager viewPager=(ViewPager)findViewById(R.id.viewPager);
        viewPager.setAdapter(new sliderAapter(this,getSupportFragmentManager()));
        tabLayout=(TabLayout)findViewById(R.id.sliding_tab);
        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });








        //return view;
    }

    private class sliderAapter extends FragmentPagerAdapter {


        public sliderAapter(Context context, FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            Log.e("adapter", ""+position);
            //  return new CalendarFragment();

          /*  Bundle bundle=new Bundle();
            bundle.putInt("position",position);
            obj.setArguments(bundle);
            return obj;*/
          if(position==0)
          {
              Login obj= new Login();
              return obj;
          }
          else{
              SignUp sign=new SignUp();
              return sign;
          }





        }

        @Override
        public int getCount() {
            return 2;// 3 tabs
        }


        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Login in";
                case 1:
                    return "Sign up";

            }
            return null;
        }

    }



}
