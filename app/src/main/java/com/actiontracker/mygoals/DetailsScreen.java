package com.actiontracker.mygoals;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import funtionality_class.Animationall;

public class DetailsScreen extends AppCompatActivity implements View.OnClickListener {

    private Animationall animationall;
    private Context context;
    private Button click_next;
    private ImageView click_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailscreen);

        animationall = new Animationall();
        context = DetailsScreen.this;

        initialize();
    }

    private void initialize() {
        click_next = (Button) findViewById(R.id.click_next);
        click_detail = (ImageView) findViewById(R.id.click_detail);
        click_next.setOnClickListener(this);
        click_detail.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.click_detail:
                break;
            case R.id.click_next:
                Intent intent = new Intent(DetailsScreen.this, Thoughts.class);
                startActivity(intent);
                animationall.Animallforward(context);
                break;
        }
    }
}