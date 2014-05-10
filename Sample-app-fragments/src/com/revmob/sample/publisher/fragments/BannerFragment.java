package com.revmob.sample.publisher.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.revmob.RevMob;
import com.revmob.ads.banner.RevMobBanner;

public class BannerFragment extends Fragment {
	RevMob revmob;
	RevMobBanner banner;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View bannerView = inflater.inflate(R.layout.banner_layout, container,
				false);
		return bannerView;
	}

	public void addBanner() {
		revmob = RevMob.start(getActivity());
		banner = revmob.createBanner(getActivity());

		View view = (View) getView().findViewById(R.id.banner);
		((ViewGroup) view).removeAllViews();
		((ViewGroup) view).addView(banner);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		addBanner();
	}

}
