package com.aprz.java;

import com.aprz.log.Log;

/**
 * Created by aprz on 17-1-12.
 * --
 */
public class CreateFragment extends Frament {

    public void doA() {
        doFuncA();
        Log.E("CreateFragment......doA");
    }

    public void doB() {
        doFuncB();
        Log.E("CreateFragment......doB");
    }

    @Override
    public void onResult() {
        super.onResult();
        Log.E("CreateFragment......onResult");
    }
}
