package com.yesol.book.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //항상 최상단에 위치
public class Application {
    public static void main (String[] args){
    SpringApplication.run(Application.class, args);
    }
}
