package com.aprz.java;

import com.aprz.log.Log;

/**
 * Created by aprz on 17-1-12.
 * --
 */
public class Frament {

    public void onResult() {
        Log.E("Frament......onResult");
    }

    public void doFuncA() {
        Log.E("Frament......doFuncA");
        onResult();
    }

    public void doFuncB() {
        Log.E("Frament......doFuncB");
        onResult();
    }
}
