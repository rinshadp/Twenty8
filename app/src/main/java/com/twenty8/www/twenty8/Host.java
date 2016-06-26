package com.example.rinshad.twenty8;

import android.app.Activity;
import android.net.nsd.NsdServiceInfo;
import android.os.Bundle;

import java.io.IOException;
import java.net.ServerSocket;


/**
 * Created by RINSHAD on 24/06/2016.
 */
public class Host extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.host);

        Mconnect mhost = new Mconnect(this);
        mhost.initializeRegistrationListener();
        ServerSocket server = null;
        try {
            server = new ServerSocket(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int port = server.getLocalPort();
        mhost.registerService(port);


    }
}

