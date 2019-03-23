package com.gupaoedu.designPattern.observerModel.JDKImplement;

import com.gupaoedu.designPattern.observerModel.Question;

/**
 * @author liangxinsheng
 * @time 2019/3/11
 * @QQ 754297966
 */
public class ObserverModelTest {

    public static void main(String[] args) {
        Student student = new Student("Fred");
        Teacher teacher = new Teacher("Tom");
        Question question = new Question();
        question.setContent("How to draw UML diagram");
        student.addObserver(teacher);
        student.commitHomework(question);
    }

}
