package com.yesol.book.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //스프링 부트의 자동설정, 스프링 Bean 읽기와 생성을 자동으로 설정하는 시작점이기 때문에 항상 최상단에 위치
public class Application {
    public static void main (String[] args){

    SpringApplication.run(Application.class, args);

    }
}
