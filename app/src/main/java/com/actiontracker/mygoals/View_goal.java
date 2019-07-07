package com.actiontracker.mygoals;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

import adapter_all.Adapter_thoughts;
import adapter_all.Adapter_viewgoal;
import funtionality_class.Animationall;

public class View_goal extends AppCompatActivity {

    private Animationall animationall;
    private Context context;
    private RecyclerView goal_view;
    private ArrayList<HashMap<String,String>> data;
    private HashMap<String,String> data_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goal_view);
        context = View_goal.this;

        animationall = new Animationall();
        initilize();
    }

    private void initilize() {
        data = new ArrayList<>();
        data_sub = new HashMap<>();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        goal_view = (RecyclerView) findViewById(R.id.goal_view);
        Adapter_viewgoal adpter_viewgoal = new Adapter_viewgoal(goal_view.getContext(), data);
        goal_view.setLayoutManager(layoutManager);
        goal_view.setAdapter(adpter_viewgoal);
    }
}
