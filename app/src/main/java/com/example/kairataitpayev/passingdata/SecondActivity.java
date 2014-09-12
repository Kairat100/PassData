package com.example.kairataitpayev.passingdata;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by kairat.aitpayev on 9/11/2014.
 */
public class SecondActivity extends Activity
{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(this, getIntent().getStringExtra("str1"), Toast.LENGTH_SHORT).show();
    }
}
