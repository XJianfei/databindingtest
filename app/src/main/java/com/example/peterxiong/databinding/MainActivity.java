package com.example.peterxiong.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.peterxiong.databinding.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final User user = new User("Test", "User");
        binding.setUser(user);

        binding.tv1.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                user.setLastName("444");
            }
        });
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        binding.rv.setLayoutManager(layoutManager);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("aaaaaa", "11111111"));
        users.add(new User("bbbbbbb", "222222"));
        ViewAdpater adapter = new ViewAdpater(users);

        binding.rv.setAdapter(adapter);

    }
}
