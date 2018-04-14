package com.dacodes.naxon.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.dacodes.naxon.R;
import com.dacodes.naxon.activities.home;

import butterknife.BindView;
import butterknife.ButterKnife;


public class match extends Fragment {

    public match() {
        // Required empty public constructor
    }

    @BindView(R.id.back)
    ImageView back;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_match, container, false);
        ButterKnife.bind(this, vista);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((home)getActivity()).cambiafragment(1);
            }
        });


        return vista;
    }
}
