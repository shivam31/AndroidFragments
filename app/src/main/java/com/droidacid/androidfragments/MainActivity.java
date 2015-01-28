package com.droidacid.androidfragments;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.app.FragmentManager;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();

        Configuration configInfo = getResources().getConfiguration();

        if(configInfo.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            FragmentLandscape fragLand = new FragmentLandscape();
            fragmentTransaction.replace(android.R.id.content, fragLand);
        } else {
            FragmentPortrait fragPort = new FragmentPortrait();
            fragmentTransaction.replace(android.R.id.content,fragPort);
        }

        fragmentTransaction.commit();
        //setContentView(R.layout.activity_main);
    }


}
