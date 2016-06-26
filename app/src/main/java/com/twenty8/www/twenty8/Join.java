package com.example.rinshad.twenty8;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by RINSHAD on 26/06/2016.
 */
public class Join extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join);

        Mconnect mhost = new Mconnect(this);
        mhost.initializeDiscoveryListener();
        mhost.initializeResolveListener();


    }
}
