package com.pineone.icbms.so.device;

import com.pineone.icmbs.so.domain.Domain;

/**
 * Created by melvin on 2016. 11. 21..
 */
public class Device {

    Domain domain = new Domain();
    public void printDevce(){
        System.out.println("디바이스정보");
        domain.printDomain();
    }
}
