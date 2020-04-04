package com.phone;

import org.apache.xpath.operations.And;

public class OperatingSystemFactory {
    public OS getInstance(String str){

        if(str.equals("open"))
            return new Android();
        else if(str.equals("closed"))
            return new IOS();
        else return new Windows();

    }
}
