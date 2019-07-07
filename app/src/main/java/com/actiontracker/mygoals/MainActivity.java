package com.actiontracker.mygoals;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import funtionality_class.Animationall;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button crate_goal, view_goal, view_history;
    private Context context;
    private Intent intent;
    private Animationall animationall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;

        animationall = new Animationall();
        initilize();
    }

    private void initilize() {
        crate_goal = (Button) findViewById(R.id.crate_goal);
        view_goal = (Button) findViewById(R.id.view_goal);
        view_history = (Button) findViewById(R.id.view_history);

        crate_goal.setOnClickListener(this);
        view_goal.setOnClickListener(this);
        view_history.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch ((v.getId())){
            case R.id.crate_goal:
                intent = new Intent(context,Create_goal.class);
                startActivity(intent);
                break;
            case R.id.view_goal:
                intent = new Intent(context,View_goal.class);
                startActivity(intent);
                break;
            case R.id.view_history:

                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        animationall.Animallbackward(context);
    }
}