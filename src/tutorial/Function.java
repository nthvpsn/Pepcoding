package tutorial;

import java.util.Scanner;

public class Function {
    public static Scanner sc = new Scanner(System.in);
    static int count =0;
    public static int countDigit(int num){
        while(num!=0){
            num/=10;
            count++;
        }
        return count;
    }

    public static int inverseNumber(int num){
//        int digitsNo = countDigit(num);
//        int value = digitsNo;
        int count = 1;
        int ans = 0;
        while(num!=0){
            int digit = num % 10;
            ans += count * (int)Math.pow(10,digit-1);
            num/=10;
            count++;
        }
        return ans;
    }


    public static void main(String[] args) {
//        int n = sc.nextInt();
//        while()

//        System.out.println(countDigit(12000345));

        System.out.println(inverseNumber(28346751));













//        hey();
//        hey2("Amar");
//        System.out.println("Max Number is " + max());
//        int ans = sum();
//        System.out.println(sum());
    }
//    public static int sum(){
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        return a+b;
//    }

    public static void hey() {
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }

    public static void hey2(String name){
        System.out.println("Hey " + name);
    }

    public static int max(){
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int max = Math.max(num1, num2);
        return max;
    }
}
