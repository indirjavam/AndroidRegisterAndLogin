package com.halit.androidregisterandlogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class UserDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        String name = getIntent().getStringExtra("name");
        String imageUrl = getIntent().getStringExtra("image");
        ImageView iv = findViewById(R.id.userImage);
        TextView tv = findViewById(R.id.userDetails);
        tv.setText(name);
        Picasso.get().load(imageUrl).into(iv);
    }
}
