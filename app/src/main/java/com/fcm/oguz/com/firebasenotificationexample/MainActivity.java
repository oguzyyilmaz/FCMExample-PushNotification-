package com.fcm.oguz.com.firebasenotificationexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String token = FirebaseInstanceId.getInstance().getToken(); //İlk çalışmada boş dönecektir.

        String msg = "Token :"+token;
        Log.d(TAG, msg);
        System.out.println(TAG + " : "+  msg);


    }
}
