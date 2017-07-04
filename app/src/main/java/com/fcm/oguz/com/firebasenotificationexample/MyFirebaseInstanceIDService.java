package com.fcm.oguz.com.firebasenotificationexample;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by oguz on 13.12.2016.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    
    private static  final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh() {

    }

    private void sendRegistrationToServer(String token) {
    }
}
