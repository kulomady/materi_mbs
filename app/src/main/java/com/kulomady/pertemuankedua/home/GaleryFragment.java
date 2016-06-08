package com.kulomady.pertemuankedua.home;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kulomady.pertemuankedua.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GaleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GaleryFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER



    public GaleryFragment() {
        // Required empty public constructor
    }

    public static GaleryFragment newInstance() {
        GaleryFragment fragment = new GaleryFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_galery, container, false);
    }

}
