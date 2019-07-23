package com.aibiancheng;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 标注主程序
 */

@SpringBootApplication
public class HelloWorldMain {

    public static void main(String[] args) {

        //启动应用
        SpringApplication.run(HelloWorldMain.class,args);
    }

}
