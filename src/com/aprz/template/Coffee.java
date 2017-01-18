package com.aprz.template;

import com.aprz.log.Log;

/**
 * Created by aprz on 16-12-28.
 * --
 *
 * 泡制 咖啡 和 茶 的流程基本上是差不多的
 *
 * 咖啡：
 * boilWater
 * brewCoffeeGrinds
 * pourInCup
 * addSugarAndMilk
 *
 * 茶
 * boilWater
 * steepTeaBag
 * pourInCup
 * addLemon
 *
 * 这两个类看起来很像，这样写让人很不软件工程，决定抽取一下代码。
 * 将 boilWater 和 pourInCup 放入父类，剩下的方法放到子类中。
 * 看起来还行，但是还是不够彻底，这两个类中还有一个共同点，就是它们的流程是一样的。
 * 现在我们讲冲泡的流程抽取出来方法父类:
 * brewCoffeeGrinds 和 steepTeaBag 实际上差不多，只是名称不一样，我们给它起个新名字，并作为抽象方法。
 * addSugarAndMilk 和 addLemon 也是
 */
public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        Log.E("Coffee brewCoffeeGrinds......");
    }

    @Override
    protected void addCondiments() {
        Log.E("Coffee addSugarAndMilk......");
    }

}
