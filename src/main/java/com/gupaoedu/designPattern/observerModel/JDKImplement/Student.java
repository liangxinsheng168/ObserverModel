package com.gupaoedu.designPattern.observerModel.JDKImplement;

import com.gupaoedu.designPattern.observerModel.Question;
import java.util.Observable;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class Student extends Observable {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void commitHomework(Question question) {
        System.out.println(this.name + " has committed homework on Gper but has a question:" + question.getContent());
        setChanged();
        notifyObservers(question);
    }
}
