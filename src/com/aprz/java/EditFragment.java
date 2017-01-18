package com.aprz.java;

import com.aprz.log.Log;

/**
 * Created by aprz on 17-1-12.
 * --
 */
public class EditFragment extends Frament {

    public static void main(String[] args) {
        EditFragment editFragment = new EditFragment();
        CreateFragment createFragment = new CreateFragment();
        editFragment.doA();
    }

    public void doA() {
        doFuncA();
        Log.E("EditFragment......doA");
    }

    public void doB() {
        doFuncB();
        Log.E("EditFragment......doB");
    }

    @Override
    public void onResult() {
        super.onResult();
        Log.E("EditFragment......onResult");
    }
}
