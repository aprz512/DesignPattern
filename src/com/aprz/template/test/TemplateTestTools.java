package com.aprz.template.test;

import com.aprz.template.Coffee;
import com.aprz.template.Tea;

/**
 * Created by aprz on 16-12-28.
 * --
 *
 * android 里面的 activity fragment 都是使用的模板模式
 *
 * onCreate onResume 等...
 */
public class TemplateTestTools {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.makeBeverage();

        Coffee coffee = new Coffee();
        coffee.makeBeverage();
    }

}
