package com.example.peterxiong.databinding;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.peterxiong.databinding.databinding.ItemBinding;

/**
 * Created by peterxiong on 2016/12/28.
 */

public class UserHolder extends RecyclerView.ViewHolder{
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
