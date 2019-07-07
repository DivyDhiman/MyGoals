package com.actiontracker.mygoals;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import adapter_all.Adapter_days;
import adapter_all.Adapter_thoughts;
import funtionality_class.Animationall;
import funtionality_class.Function_all;

public class Create_goal extends AppCompatActivity implements View.OnClickListener {

    private Animationall animationall;
    private Context context;
    private EditText goal_name, target_days;
    private RecyclerView list_days;
    private TextView cancel, create,current_month;
    private Function_all function_all;
    private ArrayList<HashMap<String,String>> days;
    private HashMap<String,String> days_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_goal);
        context = Create_goal.this;

        animationall = new Animationall();
        function_all = new Function_all();
        initilize();
    }

    private void initilize() {
        goal_name = (EditText) findViewById(R.id.goal_name);
        target_days = (EditText) findViewById(R.id.target_days);
        list_days = (RecyclerView) findViewById(R.id.list_days);
        cancel = (TextView) findViewById(R.id.cancel);
        create = (TextView) findViewById(R.id.create);
        current_month = (TextView) findViewById(R.id.current_month);
        cancel.setOnClickListener(this);
        create.setOnClickListener(this);

        Calendar calender = Calendar.getInstance();
        Date date = calender.getTime();
        SimpleDateFormat format = new SimpleDateFormat("MMMM yyyy");
        String formattedDate = format.format(date);
        current_month.setText(formattedDate);
        list_data();
    }

    private void list_data() {
        days = new ArrayList<>();

        days_sub = new HashMap<>();
        days_sub.put("days",getString(R.string.sun));
        days.add(days_sub);

        days_sub = new HashMap<>();
        days_sub.put("days",getString(R.string.mon));
        days.add(days_sub);

        days_sub = new HashMap<>();
        days_sub.put("days",getString(R.string.tue));
        days.add(days_sub);

        days_sub = new HashMap<>();
        days_sub.put("days",getString(R.string.wed));
        days.add(days_sub);

        days_sub = new HashMap<>();
        days_sub.put("days",getString(R.string.thu));
        days.add(days_sub);

        days_sub = new HashMap<>();
        days_sub.put("days",getString(R.string.fri));
        days.add(days_sub);

        days_sub = new HashMap<>();
        days_sub.put("days",getString(R.string.sat));
        days.add(days_sub);

        Adapter_days adapter_days = new Adapter_days(list_days.getContext(), days);
        list_days.setLayoutManager(new LinearLayoutManager(list_days.getContext()));
        list_days.setAdapter(adapter_days);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancel:
                finish();
                break;
            case R.id.create:
                if (function_all.EmptyCheck_edittext(goal_name)) {
                    goal_name.setError(getString(R.string.errorgoalname));
                } else if (function_all.EmptyCheck_edittext(target_days)) {
                    target_days.setError(getString(R.string.errorgoaltarget));
                } else {

                }
                break;
        }
    }
}