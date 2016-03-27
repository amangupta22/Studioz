package com.h2ostudioz.www.h2ostudioz;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;



import static android.widget.AdapterView.*;
import static android.widget.Toast.*;
import static com.h2ostudioz.www.h2ostudioz.R.id.gridview;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class ImageGalleryFragment extends Fragment {
    GridView grid_view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image_gallery, container, false);
        grid_view = (GridView) findViewById(R.id.gridview);
        grid_view.setAdapter(new ImageAdapter(this));

    }



}