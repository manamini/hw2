/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esof322hw1;

import java.util.*;

/**
 *
 * @author manam
 */
public class Esof322hw1 {

    public static void main(String[] args) {
        int list = 1;
        int[] numbers = new int[list];
        boolean stop = false;
        Scanner scan = new Scanner(System.in);
        Mathematica m = new Mathematica();
        MyMath mm = new MyMath();
        MTool mt = new MTool();
        whileLoop:
        while (stop == false) {
            System.out.println("please enter the program you would like to use to sort these numbers or Quit to stop");
            String tool = scan.next();
            if ("Quit".equals(tool)) {
                stop = true;
                break whileLoop;
            } else {
                System.out.println("please enter how many numbers you would like to input");
                list = scan.nextInt();
                numbers = new int[list];
                System.out.println("please enter the " + list + " numbers you wish to sort, one at a time");
                scan = new Scanner(System.in);
                for (int i = 0; i < list; i++) {
                    System.out.println("number :" + (i + 1));
                    numbers[i] = scan.nextInt();
                }
                for (int i = 0; i < list; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println();

                //System.out.println(tool);
            }

            switch (tool) {
                case "MTool":
                    //MTool mt = new MTool();
                    mt.mergeSort(numbers);
                    mt.sorted(numbers);
                    break;

                case "MyMath":
                    //MyMath mm = new MyMath();
                    mm.bubbleSort(numbers);
                    break;

                case "Mathematica":
                    //Mathematica m = new Mathematica();
                    m.insertionSort(numbers);
                    m.sorted(numbers);
                    break;

                case "Quit":
                    stop = true;
                    break;
            }
            System.out.println();
        }
    }

}
