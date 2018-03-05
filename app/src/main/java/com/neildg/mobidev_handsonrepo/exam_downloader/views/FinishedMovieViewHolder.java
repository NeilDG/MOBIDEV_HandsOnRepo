package com.neildg.mobidev_handsonrepo.exam_downloader.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.neildg.mobidev_handsonrepo.R;

/**
 * Created by NeilDG on 3/5/2018.
 */

public class FinishedMovieViewHolder extends RecyclerView.ViewHolder {
    private final static String TAG = "FinishedMovieViewHolder";

    private TextView movieTitleTxt;
    private TextView descText;
    private Button openBtn;

    public FinishedMovieViewHolder(View view) {
        super(view);

        this.movieTitleTxt = view.findViewById(R.id.movie_title_txt);
        this.descText = view.findViewById(R.id.desc_txt);
        this.openBtn = view.findViewById(R.id.open_btn);
    }


    public TextView getMovieTitleTxt() {
        return movieTitleTxt;
    }

    public TextView getDescText() {
        return descText;
    }
}
