package sampletest.samplejson.utils;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;


import sampletest.samplejson.Constants;

public class UILApplication extends Application {

	private static UILApplication sInstance;
	private static Context sContext;

	public static synchronized UILApplication getSharedInstance() {
		if (sInstance == null)
			sInstance = new UILApplication();
		return sInstance;
	}

	public static Context getContext() {
		return sContext;
	}

	@TargetApi(Build.VERSION_CODES.GINGERBREAD)
	@SuppressWarnings("unused")
	@Override
	public void onCreate() {

		sContext = getApplicationContext();
		if (Constants.Config.DEVELOPER_MODE
				&& Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
			StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
					.detectAll().penaltyDialog().build());
			StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
					.detectAll().penaltyDeath().build());
		}

		super.onCreate();


	}


}