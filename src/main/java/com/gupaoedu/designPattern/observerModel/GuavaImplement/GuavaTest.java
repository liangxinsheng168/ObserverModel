package com.gupaoedu.designPattern.observerModel.GuavaImplement;

import com.google.common.eventbus.EventBus;
import com.gupaoedu.designPattern.observerModel.Question;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class GuavaTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Professor professor = new Professor("Tom");
        Question question = new Question();
        question.setContent("How to draw UML diagram");
        eventBus.register(professor);
        eventBus.post(question);
    }

}
