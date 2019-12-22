package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,6,8,10);
        UnaryOperator<Integer> unaryOtp = i->i*i;
        unaryOperatorFun(unaryOtp, list).forEach(x->System.out.println(x));
    }

    private static List<Integer> unaryOperatorFun(UnaryOperator<Integer> unaryOpt, List<Integer> list) {
        List<Integer> uniList = new ArrayList<>();
        list.forEach(i->uniList.add(unaryOpt.apply(i)));
        return uniList;
    }
}
