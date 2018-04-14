package com.dacodes.naxon.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.dacodes.naxon.R;

import java.util.Timer;


public class news extends Fragment {

    public news() {
        // Required empty public constructor
    }


//    private ImageSwitcher imageSwitcher;
//    private int[] galeria = { R.drawable.news, R.drawable.match, R.drawable.live};
//    private int posicion;
//    private static final int DURACION = 9000;
//    private Timer timer = null;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news, container, false);

//        imageSwitcher = (ImageSwitcher) view.findViewById(R.id.imageSwitcher);
//        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory()
//        {
//            public View makeView()
//            {
//                ImageView imageView = new ImageView(getActivity());
//                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//                return imageView;
//            }
//        });


        return view;
    }


}
