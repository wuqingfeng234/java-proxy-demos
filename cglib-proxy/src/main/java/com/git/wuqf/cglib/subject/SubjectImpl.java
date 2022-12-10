package com.git.wuqf.cglib.subject;

public class SubjectImpl  {
    public String doAction(String name) {
        System.out.println("hello~~~" + name);
        return "hello~~~" + name;
    }
}
