package com.recycler.servicecategory;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by smartron on 19/12/17.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private List<CategoryModel> categoryModels;

    public CategoryAdapter(List<CategoryModel> categoryModels) {
        this.categoryModels = categoryModels;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView category_iv;
        TextView category_tv;

        public ViewHolder(View itemView) {
            super(itemView);

            category_iv = itemView.findViewById(R.id.category_iv);
            category_tv = itemView.findViewById(R.id.category_tv);

        }
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutInflater = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_category_list, parent, false);
        return new ViewHolder(layoutInflater);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.category_tv.setText(categoryModels.get(position).getTextView());
        holder.category_iv.setBackgroundResource(categoryModels.get(position).getImageView());

    }

    @Override
    public int getItemCount() {
        return categoryModels.size();
    }


}
