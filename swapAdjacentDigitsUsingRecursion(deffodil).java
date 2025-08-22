import java.util.*;

class HelloWorld {
    public static int swapAdjacents(int num , int base){
        if(num == 0  )
            return 0;
        int temp = num % 100;
        return (temp%10 * 10 + temp/10) * base + swapAdjacents(num/100 , base*100);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(swapAdjacents(x , 1));
    }
}


//only works for even length nums   
// Here is the C++ code for the same :
#include <iostream>
using namespace std;

int swapAdjacents(int num, int base) {
    if (num == 0)
        return 0;

    int temp = num % 100; // Get last two digits
    // Swap the two digits and process the rest
    return ((temp % 10) * 10 + temp / 10) * base + swapAdjacents(num / 100, base * 100);
}

int main() {
    int x;
    cin >> x;
    cout << swapAdjacents(x, 1) << endl;
    return 0;
}

