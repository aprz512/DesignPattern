/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aprz.command;

/**
 *
 * @author aprz
 */
public class TVOffCommand implements Command{
    
    private TV tv;
    
    
    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
    
}