package com.baoisme;

import com.baoisme.mathutil.core.MathUtility;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        testFactorialGivenRightAgrument0ReturnsWell();
        testFactorialGivenRightAgrument1ReturnsWell();
        testFactorialGivenRightAgrument5ReturnsWell();
        tesFactorialGivenWrongAgrumentReturnsMinus1ThrowsException();
    }

    public static void tesFactorialGivenWrongAgrumentReturnsMinus1ThrowsException()
    {
        MathUtility.getFactorial(-1);
        ///chạy hàm này thấy ngoại lệ bung ra mừng rơi nước măt
        //vì đưa -1 mà hàm ném ngoại lệ nghĩa là hàm chạy đúng do data cà chớn
        //hàm được thiết kế là n âm thì ném ngoại lệ
        //nếu đưa ra - 1 ném ra ngoại lệ => hàm gud
    }




    //hàm kiểm thử
    public static void testFactorialGivenRightAgrument0ReturnsWell()
    {
        int n = 0;
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(n);
        System.out.println("Expected: " + expectedResult + " Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); // *true/false

    }

    public static void testFactorialGivenRightAgrument1ReturnsWell()
    {
        int n = 1;
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(n);
        System.out.println("Expected: " + expectedResult + " Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); // *true/false

    }

    public static void testFactorialGivenRightAgrument5ReturnsWell()
    {
        int n = 5;
        long expectedResult = 120;
        long actualResult = MathUtility.getFactorial(n);
        System.out.println("Expected: " + expectedResult + " Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); // *true/false

    }
    //dân dev  phải test code của chính họ.
    //vậy họ test code của họ như thế nào
    //trước khi test (test run) thì cần có test case


    // test case #1
    // check getFactorial() with N = 0;
    //Steps:
    // N = 0; Call GetFactorial(0)
    //Excpected reults, value = 1;

    // test case #2
    // check getFactorial() with N = 1;
    //Steps:
    // N = 0; Call GetFactorial(1)
    //Excpected reults, value = 1;

    // test case #3
    // check getFactorial() with N = 5;
    //Steps:
    // N = 0; Call GetFactorial(5)
    //Excpected reults, value = 120;

    //test case #4
    //check get factorial() with n = -1
    //Steps:
    // N = -1; Call GetFactorial(-1)
    //Excpected reults/ value = An exception is thrown;

    //test case #5
    //check get factorial() with n = 21
    //Steps:
    //(1) N = 21;
    //(2) Call GetFactorial(21)
    //Excpected reults/ value = An exception is thrown;
}