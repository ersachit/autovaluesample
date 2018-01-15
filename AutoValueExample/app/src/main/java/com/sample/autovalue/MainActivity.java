package com.sample.autovalue;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sample.autovalue.data.DummyData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start(this);
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, SecondActivity.class);
        starter.putExtra(Constant.DATA, DummyData.employeeData);
        context.startActivity(starter);
    }
}
