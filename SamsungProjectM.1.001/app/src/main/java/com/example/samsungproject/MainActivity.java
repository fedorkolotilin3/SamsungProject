package com.example.samsungproject;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    private static FragmentManager fm;
    private static FragmentTransaction tr;
    private static int mainView = R.id.mainView;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();

        addFragment(new StartFragment());
        //eplaceFragment(new CreateRoomFragment());

    }

    private void initialize(){
        fm = getSupportFragmentManager();
    }

    static public void addFragment(Fragment fragment){

        tr = fm.beginTransaction();
        tr.add(mainView, fragment);
        tr.commit();
    }
    static public void replaceFragment(Fragment fragment){
        tr = fm.beginTransaction();
        tr.replace(R.id.mainView, fragment, "SomeTag");
        tr.addToBackStack(null);
        tr.commit();
    }
}