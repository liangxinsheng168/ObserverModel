package com.gupaoedu.designPattern.observerModel.GuavaImplement;

import com.google.common.eventbus.Subscribe;
import com.gupaoedu.designPattern.observerModel.Question;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class Professor {

    private String name;

    public Professor(String name) {
        this.name = name;
    }

    @Subscribe
    public void receiveHomework(Question question) {
        System.out.println(this.name + " has received the homework and will answer the question for " + question.getContent());
    }
}
