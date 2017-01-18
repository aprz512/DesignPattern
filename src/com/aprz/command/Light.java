/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprz.command;

import com.aprz.log.Log;

/**
 *
 * @author aprz
 */
public class Light {
    
    public void on() {
        Log.E("light on");
    }
    
    public void off() {
        Log.E("light off");
    }
    
}
