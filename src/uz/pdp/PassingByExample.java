package uz.pdp;

import java.util.Arrays;

public class PassingByExample {
    public static void main(String[] args) {
//        Passing By Value and Passing By Reference
        int num1=5;
        int num2=10;
        int[] nums={1,2,3,4,5,6};

        System.out.println(add(num1,num2));
        System.out.println("num1 = " + num1);
        printArray(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static int add(int a, int b){
        a=20;
        return a+b;
    }
    public static void printArray(int ints[] ){
        ints[0]=50;
        ints=new int[]{10,11};
        for (int num : ints) {
            System.out.print(num+", ");
        }
        System.out.println("\b\b");
    }
}
