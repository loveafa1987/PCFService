package com.manulife.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplicationContextDemo {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\robertcheng\\Downloads\\demo\\src\\main\\resources\\SpringApplicationContext.xml");
        SortArrUtil obj = (SortArrUtil) context.getBean("sortArrUtil");
        obj.sortArr();
    }
}


