package com.satyamnihal.saver.recycler;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.satyamnihal.saver.R;

/**
 * Created by nihal
 */

public class VideoViewHolder extends RecyclerView.ViewHolder {


    public ImageView imageView,imageViewCheck,imageViewPlay;


    public VideoViewHolder(View view) {
        super(view);


        this.imageView = (ImageView) view.findViewById(R.id.imageView_wa_image);
        this.imageViewCheck = (ImageView) view.findViewById(R.id.imageView_wa_checked);
        this.imageViewPlay = (ImageView) view.findViewById(R.id.imageView_wa_play);

    }
}