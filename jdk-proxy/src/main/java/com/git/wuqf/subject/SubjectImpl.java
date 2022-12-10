package com.git.wuqf.subject;

public class SubjectImpl implements ISubject {
    @Override
    public String doAction(String name) {
        System.out.println("hello~~~" + name);
        return "hello~~~" + name;
    }
}
