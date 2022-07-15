package com.tung.volleyrestapi.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.request.RequestOptions;
import com.tung.volleyrestapi.model.DiscountItems;

import java.util.List;

public class DiscountItemsAdapter extends RecyclerView.Adapter<DiscountItemsAdapter.MyViewHolder>{

    private Context context;
    RequestOptions options;
    List<DiscountItems> itemsList;

    // constructor
    public DiscountItemsAdapter(Context context, List<DiscountItems> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    // declare UI elements here
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView_product_photo;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);

        }
    }

}
