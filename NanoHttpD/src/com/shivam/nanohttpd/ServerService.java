package com.shivam.nanohttpd;

import java.io.IOException;

import android.app.IntentService;
import android.content.Intent;

public class ServerService extends IntentService {

	public ServerService() {
		super("server thread");
	}

	@Override
	protected void onHandleIntent(Intent intent) {
		System.out.println("--->>> service started");
		WebServer ws = new WebServer();
		try {
			ws.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
