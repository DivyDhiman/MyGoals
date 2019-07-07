package com.actiontracker.mygoals;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import adapter_all.Adapter_thoughts;
import funtionality_class.Animationall;

public class Thoughts extends AppCompatActivity {

    private RecyclerView thoughts;
    private Button next;
    private ArrayList<HashMap<String, Object>> thoughtslist;
    private HashMap<String, Object> thoughtslist_sub;
    private Animationall animationall;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thoughts);
        animationall = new Animationall();
        context = Thoughts.this;

        initialize();
    }

    private void initialize() {
        thoughts = (RecyclerView) findViewById(R.id.thoughts);
        next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Thoughts.this, MainActivity.class);
                startActivity(intent);
                animationall.Animallforward(context);
            }
        });

        contentlist();
    }

    private void contentlist() {
        thoughtslist = new ArrayList<>();

        thoughtslist_sub = new HashMap<>();
        thoughtslist_sub.put("list", getString(R.string.list1));
        thoughtslist_sub.put("listath", getString(R.string.listath1));
        thoughtslist.add(thoughtslist_sub);

        thoughtslist_sub = new HashMap<>();
        thoughtslist_sub.put("list", getString(R.string.list2));
        thoughtslist_sub.put("listath", getString(R.string.listath2));
        thoughtslist.add(thoughtslist_sub);

        thoughtslist_sub = new HashMap<>();
        thoughtslist_sub.put("list", getString(R.string.list3));
        thoughtslist_sub.put("listath", getString(R.string.listath3));
        thoughtslist.add(thoughtslist_sub);

        thoughtslist_sub = new HashMap<>();
        thoughtslist_sub.put("list", getString(R.string.list4));
        thoughtslist_sub.put("listath", getString(R.string.listath4));
        thoughtslist.add(thoughtslist_sub);

        thoughtslist_sub = new HashMap<>();
        thoughtslist_sub.put("list", getString(R.string.list5));
        thoughtslist_sub.put("listath", getString(R.string.listath5));
        thoughtslist.add(thoughtslist_sub);

        thoughtslist_sub = new HashMap<>();
        thoughtslist_sub.put("list", getString(R.string.list6));
        thoughtslist_sub.put("listath", getString(R.string.listath6));
        thoughtslist.add(thoughtslist_sub);

        thoughtslist_sub = new HashMap<>();
        thoughtslist_sub.put("list", getString(R.string.list7));
        thoughtslist_sub.put("listath", getString(R.string.listath7));
        thoughtslist.add(thoughtslist_sub);

        Adapter_thoughts adptercontent = new Adapter_thoughts(thoughts.getContext(), thoughtslist);
        thoughts.setLayoutManager(new LinearLayoutManager(thoughts.getContext()));
        thoughts.setAdapter(adptercontent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        animationall.Animallbackward(context);
    }
}