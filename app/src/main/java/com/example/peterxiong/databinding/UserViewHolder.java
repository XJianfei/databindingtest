package com.example.peterxiong.databinding;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by peterxiong on 2016/12/28.
 */

public class UserViewHolder extends RecyclerView.ViewHolder {
    public TextView firstName;
    public TextView lastName;
    public UserViewHolder(View itemView) {
        super(itemView);
        firstName = (TextView) itemView.findViewById(R.id.firstName);
        lastName = (TextView) itemView.findViewById(R.id.lastName);
    }
}
