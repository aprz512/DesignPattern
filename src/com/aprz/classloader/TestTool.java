package com.aprz.classloader;

/**
 * Created by aprz on 17-2-24.
 */
public class TestTool {

    public static void main(String[] args) {
        try {
            System.out.print(new Arithmetic().getResult("3 + (4 * 5) - 20"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
