import java.util.*;

class HelloWorld {
    public static int reverseNum(int num , int base){
        if(num % 10 == num)
            return num;
        return  num % 10 * (int)Math.pow(10 , base - 1) + reverseNum(num/10 , base-1);
    }
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println(reverseNum(x , 9));
    }
}
