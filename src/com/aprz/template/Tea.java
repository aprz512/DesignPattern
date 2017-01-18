package com.aprz.template;

import com.aprz.log.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aprz on 16-12-28.
 * --
 */
public class Tea extends CaffeineBeverage {

    @Override
    protected void brew() {
        Log.E("Tea steepTeaBag......");
    }

    @Override
    protected void addCondiments() {
        Log.E("Tea addLemon......");
    }

    @Override
    protected boolean customerWantCondiments() {

        Log.E("would you like some Lemon in you tea?(y/n)");
        String answer = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            Log.E("can not read you answer!");
        }


        return !"n".equals(answer);
    }
}
