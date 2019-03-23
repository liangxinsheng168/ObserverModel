package com.gupaoedu.designPattern.observerModel.JDKImplement;

import com.gupaoedu.designPattern.observerModel.Question;

import java.util.Observable;
import java.util.Observer;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        Student student = (Student)o;
        Question question = (Question)arg;
        System.out.println(this.name + " has received the homework from " + student.getName() + " and will answer the question for " + question.getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
