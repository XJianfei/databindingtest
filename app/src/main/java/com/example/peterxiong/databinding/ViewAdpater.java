package com.example.peterxiong.databinding;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.peterxiong.databinding.databinding.ItemBinding;

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
        /*
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null);
        return new UserViewHolder(v);
        */
        return UserHolder.create(LayoutInflater.from(parent.getContext()), parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((UserHolder)holder).bindTo(users.get(position));
        /*
        UserViewHolder userViewHolder = (UserViewHolder)holder;
        if (userViewHolder == null)
            return;
        User user = users.get(position);
        userViewHolder.firstName.setText(user.getFirstName());
        userViewHolder.lastName.setText(user.getLastName());
        */
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    static class UserHolder extends RecyclerView.ViewHolder {
        static UserHolder create(LayoutInflater inflater, ViewGroup parent) {
            //ItemBinding binding = Item.
            ItemBinding binding = ItemBinding.inflate(inflater, parent, false);
            return new UserHolder(binding);
        }

        private ItemBinding mBinding;
        private UserHolder(ItemBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }

        public void bindTo(User user) {
            mBinding.setUser(user);
            mBinding.executePendingBindings();
        }
    }
}
