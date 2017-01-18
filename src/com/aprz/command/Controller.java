/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprz.command;

/**
 * 实现这样的一个遥控器，遥控器上有 A B C D 四个插槽。
 * 每个插槽对应这 开 关 两个按钮。
 * 每个插槽可以插入一个接收器，现有的接收器有：电视接收器，
 * 空调接收器，音响接收器，灯泡接收器。
 * 
 * 无论接收器放到那个插槽，都要能正确的相应 开 关 的功能。
 * 怎么编程？？？
 * 
 * @author aprz
 */
public class Controller {
    
    Command[] onCommand = new Command[4];
    Command[] offCommand = new Command[4];
    
    public void setCommand(Command on, Command off, int slot) {
        onCommand[slot] = on;
        offCommand[slot] = off;
    }
    
    public void on(int slot) {
        onCommand[slot].execute();
    }
    
    public void off(int slot) {
        offCommand[slot].execute();
    }
}
