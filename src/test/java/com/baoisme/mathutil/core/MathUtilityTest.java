package com.baoisme.mathutil.core;

import org.junit.jupiter.api.Test;

//import static là cách khai báo trước tên class chứa hàm static
//để ở dưới gọi hàm static ngắn gọn như bên pascal, C, gọi hàm kh cần dấu chấm
//nếu có nhiều hàm static thì ta chỉ cần import static tên class . *
import static com.baoisme.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //class này xài bộ thư viện JUnit, được tải qua Maven trên mạng về tự động bởi Maven.
    //Bộ thư viện này dùng để test tự động các hàm của class chính
    //Nó sẽ tự chạy khi óng gói app, để check xem các hàm có chạy đúng không
    //Đúng tức là Expected == Actual
    //Nếu có nhiều test case, thì nó sẽ gom Status của các test casse lại thành 2 màu đỏ, mắt dân dev chỉ cần nhìn 2 màu Xanh -Passed
    //Đỏ _ Failed mà kh cần nhìn từng test case coi passed hay failed
    //Y chang cho các ngôn ngữ lập trình khác
    //- Là chuẩn test code rồi
    //Bộ thư viện này còn được gọi là Framework, Junit testing framework


    //Test case #5
    @Test
    public void testFactorialGivenRightAgrument10ReturnsWell()
    {
        assertEquals(720,getFactorial(6));
        //                  5! hi vọng trả về 120
        //assert là hàm so 2 giá trị có == nhau kh, của thư viện JUnit

    }

    //Test case #4
    @Test
    public void testFactorialGivenRightAgrument5ReturnsWell()
    {
        assertEquals(120,getFactorial(5));
        //                  5! hi vọng trả về 120
        //assert là hàm so 2 giá trị có == nhau kh, của thư viện JUnit

    }

    //Test case #3
    @Test
    public void testFactorialGivenRightAgrument4ReturnsWell()
    {
        assertEquals(24,getFactorial(4));
        //                  4! hi vọng trả về 16
        //assert là hàm so 2 giá trị có == nhau kh, của thư viện JUnit

    }

    //Test case #2
    @Test
    public void testFactorialGivenRightAgrument1ReturnsWell()
    {
        assertEquals(1,getFactorial(1));
        //                  1! hi vọng trả về 1
        //assert là hàm so 2 giá trị có == nhau kh, của thư viện JUnit

    }


    //Test case #1: Verify GetFactorial with n = 0;
    ///Expected Result: 0! == 1
    @Test
    public void testFactorialGivenRightAgrument0ReturnsWell()
    {
        int n = 0;
        long expectedResult = 1;
        long actualResult = getFactorial(n);

//        System.out.println("Expected: " + expectedResult + " Actual: " + actualResult);
//        System.out.println(expectedResult == actualResult); // *true/false

        assertEquals(expectedResult,actualResult);
        //so sánh xem 2 đứa expected == actual không??? nhưng không viết sout();ss
        //Hàm này của class thư viện JUnit
    }

}