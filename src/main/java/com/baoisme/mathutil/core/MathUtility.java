package com.baoisme.mathutil.core;

public class MathUtility {
    // class này cung câp các hàm liên quan toán học
    // nó là thư viện toán học. Mà thư viện tính toán thường sẽ dùng các hàm thường sẽ là static
    //hàm tnhs n!
    // n! = 1.2.3....n, tỏng đó
    // 0! = 1! = 1
    // mình kh tính quá 21! vì 20! Kiểu long kh chưa nổi sẽ tính sau
    // mà mình chỉ tính từ 0..... 20!
    // hàm nhận vào n, trả về n! ( n tỏng đoạn từ [0....20]
    // 1 lấy reqs, 2 test case
    public static long getFactorial(int n)
    {
        //kĩ thuật nhồi con heo đất, ốc nhồi thịt, tiếp chiêu
        // kĩ thuật nhân dồn, cộng ồn giá trí
        if ( n < 0 ||  n > 20)
            throw new IllegalArgumentException("Invalid n. n must be in range [0, 20]");
        long result = 1;
        if (n == 0)
            return 1; //thoát sớm khi có thể, return ngay khi có thể
        // if av for chỉ có 1 lệnh kh cần {.....1 lệnh}
        //return sớm kh cần dùng luôn

        for (int i = 1; i <= n; i++) {
//          result = result * i;
            result *= i; //nhan dồn từ 1 đến n, i tăng từ 1 2 3, dồn vào results
        }
        return result;
    }


}

