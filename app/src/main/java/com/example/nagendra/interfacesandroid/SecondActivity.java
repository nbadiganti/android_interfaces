package com.example.nagendra.interfacesandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Nagendra on 22/09/14.
 */
public class SecondActivity extends Activity implements SampleInterface{

    private String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
    }

    @Override
    public void MethodA() {
        Log.d(TAG, "Method A called");
    }

    @Override
    public void MethodB() {
        Log.d(TAG, "Method B called");
    }
}
