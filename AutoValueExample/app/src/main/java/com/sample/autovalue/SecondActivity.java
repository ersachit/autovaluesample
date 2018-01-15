package com.sample.autovalue;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.sample.autovalue.model.EmployeeData;

/**
 * Created by sachit on 15/01/18.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        EmployeeData employeeData = getIntent().getParcelableExtra(Constant.DATA);
        Toast.makeText(this, employeeData.name() + ", "
                + employeeData.id() + ", "
                + employeeData.status() + ", "
                + employeeData.address().get(0), Toast.LENGTH_SHORT).show();

    }
}
