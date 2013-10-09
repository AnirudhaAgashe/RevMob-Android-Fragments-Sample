package com.revmob.sample.publisher.fragments;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	
	public static MainActivity activity = null;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
        
        setContentView(R.layout.revmob_layout);
        
        BannerFragment fragment = (BannerFragment) getFragmentManager().findFragmentById(R.id.bannerBox);
        if (fragment != null && fragment.isInLayout()) {
        	fragment.addBanner(activity);
        }
        
        
	}
}
