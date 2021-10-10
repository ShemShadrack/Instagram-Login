package com.example.instagramlogin;

import android.os.AsyncTask;

public interface  AuthenticationListener {

     void onTokenReceived(String auth_token);

}
