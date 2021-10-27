package com.vision.after_di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

   public static void main(String[] args) {
      //���� �����ϴ� ȯ������ ����
      String configLoc = "classpath:appContext.xml";
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
      MyCalculator mycalc = ctx.getBean("mycalc",MyCalculator.class); //new ������ ���
      mycalc.add();
      mycalc.sub();
      mycalc.mul();
      mycalc.div();
   }
}