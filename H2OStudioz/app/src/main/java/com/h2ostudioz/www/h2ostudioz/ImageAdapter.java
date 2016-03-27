package com.h2ostudioz.www.h2ostudioz;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by aka on 05-03-2016.
 */
public class ImageAdapter extends BaseAdapter {
    private Context CTX;
    private Integer img_id[] = {R.drawable.index,
            R.drawable.index3,
            R.drawable.images7,
            R.drawable.images6
    };
    public ImageAdapter(Context CTX){
        this.CTX = CTX;
    }

    @Override
    public int getCount() {
        return img_id.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int arg0, View arg1, ViewGroup arg2) {
        ImageView img;
        if (arg1 == null)
        {
            img = new ImageView(CTX);
            img.setLayoutParams(new GridView.LayoutParams(160,160));
            img.setScaleType(ImageView.ScaleType.CENTER_CROP);
            img.setPadding(8, 8, 8, 8);

        }
        else
        {
            img = (ImageView) arg1;

        }
        img.setImageResource(img_id[arg0]);
        return img;

    }
}
