package runner;

import classes.ArrayDemo;

public class TestArrayDemo {
 public static void main(String[] args) {
 ArrayDemo ad=new ArrayDemo(); //object creation
 ad.printNumber(10); //method calling/invoke/accessing
 int[] empIdsArr=new int[5]; //array creation
 empIdsArr[0]=101; // initialization
 empIdsArr[1]=102;
 empIdsArr[2]=103;
 empIdsArr[3]=104;
 empIdsArr[4]=105;
 ad.printArrayElements(empIdsArr); //method calling/invoke/accessing
 }
}
