package com.ubm.uas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.tv_register);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "Roboto-Regular.ttf");
        textView.setTypeface(typeface);

        String text = "Don't have an account? Register here";

        SpannableString ss = new SpannableString(text);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }
        };

        ForegroundColorSpan fcsExtraLightGreen = new ForegroundColorSpan(Color.rgb(132, 169, 140));


        ss.setSpan(clickableSpan1, 32,36, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(fcsExtraLightGreen,32,36,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        ArrayList<CVItems> CVLists = new ArrayList<>();
        CVLists.add(new CVItems(R.drawable.ic_android, "Line1"));
        CVLists.add(new CVItems(R.drawable.ic_audiotrack, "Line2"));
        CVLists.add(new CVItems(R.drawable.ic_sun, "Line3"));

        mRecyclerView = findViewById(R.id.rv_ListMenu);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new CVAdapter(CVLists);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}