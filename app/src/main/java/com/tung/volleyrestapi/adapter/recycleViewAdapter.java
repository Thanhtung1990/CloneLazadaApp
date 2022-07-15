package com.tung.volleyrestapi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.tung.volleyrestapi.R;
import com.tung.volleyrestapi.model.Anime;

import java.util.List;

public class recycleViewAdapter extends RecyclerView.Adapter<recycleViewAdapter.MyViewHolder>{

    private Context context;
    private List<Anime> listAnime;
    RequestOptions options;

    // Constructor
    public recycleViewAdapter(Context context, List<Anime> listAnime) {
        this.context = context;
        this.listAnime = listAnime;

        // write option for Glide
        options = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.anime_row_item, parent,false);

        // write code to send intend here when user click each item


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.anime_title.setText(listAnime.get(position).getName());
        holder.anime_category.setText(listAnime.get(position).getCategorie());
        holder.anime_rating.setText(listAnime.get(position).getRating());
        holder.anime_studio.setText(listAnime.get(position).getStudio());

        // load images from URL
        Glide.with(context).load(listAnime.get(position).getImage_url()).apply(options).into(holder.thumbnail);

    }

    @Override
    public int getItemCount() {
        return listAnime.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView thumbnail;
        private TextView anime_title, anime_category, anime_rating, anime_studio;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            thumbnail = itemView.findViewById(R.id.thumbnail);
            anime_title = itemView.findViewById(R.id.anime_title);
            anime_category = itemView.findViewById(R.id.anime_category);
            anime_rating = itemView.findViewById(R.id.anime_rating);
            anime_studio = itemView.findViewById(R.id.anime_studio);
        }





    }


}
