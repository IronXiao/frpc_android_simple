package com.ironxiao.frpc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;

import androidx.annotation.Nullable;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }


    public void startFrpc(View view) {
        Intent intent = new Intent( this, FrpcService.class );
        startService( intent );
    }

    public void quit(View view) {
        Intent intent = new Intent( this, FrpcService.class );
        stopService( intent );
        System.exit( 0 );
    }
}