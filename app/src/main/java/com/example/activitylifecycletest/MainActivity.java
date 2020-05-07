package com.example.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("","onCreate");
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null){
            String tempData = savedInstanceState.getString("data_key");
            Log.d("",tempData);
        }
        Button startNormalActivity = (Button)findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button)findViewById(R.id.start_dialog_activity);
        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent);
            }
        });
        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        String tempData = "Something you just typed";
        outState.putString("data_key",tempData);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("","onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("","onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("","onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("","onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("","onDestroy");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("", "onRestart");
    }
}
