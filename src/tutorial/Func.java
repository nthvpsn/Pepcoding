package tutorial;

public class Func {
    public static void main(String[] args) {
//        System.out.println("Hello");
        int bin = decimalToBinary(100);
        System.out.println(bin);

        int dec = binaryToDecimal(bin);
        System.out.println(dec);
    }
    public static int getValueInBase(int n, int b){
        int ans = 0;
        int place = 1;
        while(n!=0){
        int digit = n%b;
        ans += digit * place;
        place *= 10;
        n/=b;
        }
        return ans;
    }
    public static int binaryToDecimal(int n){
        int sol = 0;
        int place = 1;
        while(n!=0) {
            int digit = n % 10;
            sol += digit * place;
            place *= 2;
            n /= 10;

        }
        return sol;
    }
    public static int decimalToBinary(int n){
        int ans = 0;
        int place = 1;
        while(n!=0) {
            int digit = n % 2;
            ans += digit * place;
            place *= 10;
            n /= 2;

        }
            return ans;
    }
}
