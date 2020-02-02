package com.aravind.viewmodel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    private String TAG = getClass().getSimpleName();
    private String myRandomNumber;

    public String getNumber() {
        Log.i(TAG, "Get Number");
        if (myRandomNumber == null) {
            createRandomNumber();
        }
        return myRandomNumber;
    }

    private void createRandomNumber() {
        Log.i(TAG, "Create Number");
        Random random = new Random();
        myRandomNumber = "Number " + (random.nextInt(1000 - 1) + 2);
    }
}
