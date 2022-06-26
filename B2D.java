import java.util.*;
public class B2D {
    static int binaryToDecimal(int n)
    {
        int num = n;
        int dec_value = 0;

       
        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        return dec_value;
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println(binaryToDecimal(num));
    }
}