package com.example.peterxiong.databinding;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by peterxiong on 2016/12/28.
 */

public class ViewAdpater extends RecyclerView.Adapter {
    private List<User> users = null;
    public ViewAdpater(List<User> user) {
        users = user;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null);
        return new UserViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        UserViewHolder userViewHolder = (UserViewHolder)holder;
        if (userViewHolder == null)
            return;
        User user = users.get(position);
        userViewHolder.firstName.setText(user.getFirstName());
        userViewHolder.lastName.setText(user.getLastName());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
