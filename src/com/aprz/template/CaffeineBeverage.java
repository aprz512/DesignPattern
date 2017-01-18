package com.aprz.template;

import com.aprz.log.Log;

/**
 * Created by aprz on 16-12-28.
 * --
 */
public abstract class CaffeineBeverage {

    public void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments()) {
            addCondiments();
        }
    }

    // 一个钩子方法 子类按需决定是否需要实现
    protected boolean customerWantCondiments() {
        return true;
    }

    private void boilWater() {
        Log.E("boilWater......");
    }

    /**
     * 具体的泡制过程
     */
    protected abstract void brew();

    private void pourInCup() {
        Log.E("pourInCup......");
    }

    /**
     * 加一些调味品
     */
    protected abstract void addCondiments();

}
