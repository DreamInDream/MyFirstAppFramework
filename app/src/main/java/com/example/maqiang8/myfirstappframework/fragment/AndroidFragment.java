package com.example.maqiang8.myfirstappframework.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.maqiang8.myfirstappframework.R;


public class AndroidFragment extends Fragment {
    public AndroidFragment(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.android_fragment,container,false);
        return v;
    }
}
