package com.dacodes.naxon.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dacodes.naxon.R;
import com.dacodes.naxon.RecyclerViewClickListener;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by rodrigo on 13/04/18.
 */

public class menuItems extends RecyclerView.Adapter<menuItems.ViewHolder> {

    private String [] titleData;
    private String [] bodyData;
    private int [] url;
    private Context context;
    private RecyclerViewClickListener mListener;



    public menuItems(String[] titleData, String[] bodyData, int[] url, Context context, RecyclerViewClickListener mListener) {
        this.titleData = titleData;
        this.bodyData = bodyData;
        this.url = url;
        this.context = context;
        this.mListener=mListener;
    }

    @Override
    public menuItems.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.menu_items, parent, false);

        return new ViewHolder(view, mListener);
    }

    @Override
    public void onBindViewHolder(final menuItems.ViewHolder holder, int position) {
        String title=titleData[position];
        String body=bodyData[position];
        int background=url[position];
        holder.title_news.setText(title);
        holder.body_news.setText(body);
        Picasso.with(context).load(background).into(holder.layout_back);

    }

    @Override
    public int getItemCount() {
        return titleData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        @BindView(R.id.layout_back) ImageView layout_back;
        @BindView(R.id.title_news) TextView title_news;
        @BindView(R.id.body_news) TextView body_news;

        public ViewHolder(View itemView, RecyclerViewClickListener listener) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mListener = listener;
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            mListener.onClick(view, getAdapterPosition());
        }
    }
}
