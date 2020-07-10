/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanakhir;

/**
 *
 * @author Hargi
 */
public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Shape circle = new Circle();

      Shape redCircle = new BlueShapeDecorator(new Circle());

      Shape redRectangle = new BlueShapeDecorator(new Rectangle());


      System.out.println("\nCircle of blue border");
      redCircle.draw();

      System.out.println("\nRectangle of blue border");
      redRectangle.draw();
   }
}
