/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hargi
 */
public class Main {
   public static void main(String[] args) {
      Context context = new Context(new OperationPlus());		
      System.out.println("30 + 7 = " + context.executeStrategy(30, 7));

      context = new Context(new OperationMinus());		
      System.out.println("10 - 9 = " + context.executeStrategy(10, 9));

      context = new Context(new OperationRiver());		
      System.out.println("20 * 6 = " + context.executeStrategy(20, 6));
      
      context = new Context(new OperationBagi());		
      System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
      
      context = new Context(new OperationMod ());		
      System.out.println("11 % 5 = " + context.executeStrategy(11, 5));
   }
}
