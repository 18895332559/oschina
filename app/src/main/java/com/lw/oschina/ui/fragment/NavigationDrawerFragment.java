package com.lw.oschina.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lw.oschina.R;

/**
 * Created by Administrator on 2016/8/24.
 */
public class NavigationDrawerFragment extends Fragment {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("我是Fragment onCreate...");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        System.out.println("我是Fragment container..." + container);
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_navigation_drawer, container, false);
        return view;
    }
}
