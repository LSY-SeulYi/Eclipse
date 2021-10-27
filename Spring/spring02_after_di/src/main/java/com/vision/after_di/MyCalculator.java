package com.vision.after_di;

public class MyCalculator {
   Calculator calc;
   private double firstNum;
   private double secondNum;
   public MyCalculator() {}
   
   public Calculator getCalc() {
      return calc;
   }
   public void setCalc(Calculator calc) {
      this.calc = calc;
   }
   public double getFirstNum() {
      return firstNum;
   }
   public void setFirstNum(double firstNum) {
      this.firstNum = firstNum;
   }
   public double getSecondNum() {
      return secondNum;
   }
   public void setSecondNum(double secondNum) {
      this.secondNum = secondNum;
   }
   ////////////////////////////////////////////
   public void add() {
      calc.add(firstNum,secondNum);
   }
   public void sub() {
      calc.sub(firstNum,secondNum);
   }
   public void mul() {
      calc.mul(firstNum,secondNum);
   }
   public void div() {
      calc.div(firstNum,secondNum);
   }
   
   
}