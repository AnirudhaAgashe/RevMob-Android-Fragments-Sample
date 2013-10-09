package com.revmob.sample.publisher.fragments;

import com.revmob.RevMob;
import com.revmob.ads.banner.RevMobBanner;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BannerFragment extends Fragment {
	RevMob revmob;
	RevMobBanner banner;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View bannerView = inflater.inflate(R.layout.banner_layout, container, false);
	    return bannerView;
	 }
	  
	public void addBanner(Activity activity) {
		revmob = RevMob.start(activity);
	    banner = revmob.createBanner(activity);
		
	    View view = (View) getView().findViewById(R.id.bannerBox);
	    ((ViewGroup) view).addView(banner);
	  }
	
	
} 
