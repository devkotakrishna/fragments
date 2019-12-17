package com.krishna.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;
import com.krishna.fragments.fragments.FirstFragment;
import com.krishna.fragments.fragments.Secondfragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnFragment;
    private  Boolean status =true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFragment=findViewById(R.id.btnFragment);
        btnFragment.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
         if (status){
             FirstFragment firstFragment =new FirstFragment();
             fragmentTransaction.replace(R.id.fragmentContainer,firstFragment);
             fragmentTransaction.commit();
             btnFragment.setText("load second Fragment");
             status=false;
         }

         else {
             Secondfragment secondFargment =new Secondfragment();
             fragmentTransaction.replace(R.id.fragmentContainer,secondFargment);
             fragmentTransaction.commit();
             btnFragment.setText("load first Fragment");
             status=true;

         }

    }
}
