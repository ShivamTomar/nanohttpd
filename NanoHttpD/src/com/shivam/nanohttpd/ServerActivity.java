package com.shivam.nanohttpd;

import android.app.Activity;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.Menu;

public class ServerActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);
        
        System.out.println("--->>> "+getLocalIpAddress());
        
        Intent intent = new Intent(this, ServerService.class);
        startService(intent);
    }
    
    public String getLocalIpAddress() {
    	WifiManager wm = (WifiManager) getSystemService(WIFI_SERVICE);
    	return Formatter.formatIpAddress(wm.getConnectionInfo().getIpAddress());
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_server, menu);
        return true;
    }
}
