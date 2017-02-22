/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprz.command.test;

import com.aprz.command.Controller;
import com.aprz.command.Light;
import com.aprz.command.LightOffCommand;
import com.aprz.command.LightOnCommand;
import com.aprz.command.TV;
import com.aprz.command.TVOffCommand;
import com.aprz.command.TVOnCommand;

/**
 *
 * @author aprz
 *
 * 命令模式：将一个动作（算法程序之类的）封装成一个对象
 *
 * 实现调用者与接受者的解耦
 */
public class CommandDriverTool {
    
    public static void main(String[] args) {
        Controller controller = new Controller();
        
        // 实例化 tv 接收器
        TV tv = new TV();
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        
        // 将tv接收器插入 C 插槽
        controller.setCommand(tvOnCommand, tvOffCommand, 2);
        
        // 实例化 灯泡 接收器
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        
        // 将 灯泡接收器插入 A 插槽
        controller.setCommand(lightOnCommand, lightOffCommand, 0);
        
        // 打开tv
        controller.on(2);
        // 打开 灯泡
        controller.on(0);
        // 关闭 灯泡
        controller.off(0);
        // 关闭 tv
        controller.off(2);
    }
    
}
