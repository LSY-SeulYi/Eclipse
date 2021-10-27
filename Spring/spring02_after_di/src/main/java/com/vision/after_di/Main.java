package com.vision.after_di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

   public static void main(String[] args) {
      //빈을 생성하는 환경파일 지정
      String configLoc = "classpath:appContext.xml";
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
      MyCalculator mycalc = ctx.getBean("mycalc",MyCalculator.class); //new 연산자 대신
      mycalc.add();
      mycalc.sub();
      mycalc.mul();
      mycalc.div();
   }
}