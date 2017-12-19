package com.recycler.servicecategory;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by smartron on 19/12/17.
 */

public class CategoryModel {


    private int imageView;
    private String textView;


    public CategoryModel(int imageView, String textView) {
        this.imageView = imageView;
        this.textView = textView;
    }

    public int getImageView() {
        return imageView;
    }

    public String getTextView() {
        return textView;
    }

}
