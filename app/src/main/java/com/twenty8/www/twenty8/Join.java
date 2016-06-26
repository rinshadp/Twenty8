package com.twenty8.www.twenty8;

import android.app.Activity;
import android.net.nsd.NsdServiceInfo;
import android.os.Bundle;

import java.net.InetAddress;

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

        mhost.discoverServices();

        NsdServiceInfo service = mhost.getChosenServiceInfo();
        InetAddress ip = service.getHost();
        int port = service.getPort();




    }
}
