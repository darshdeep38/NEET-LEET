// Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

class Solution {
public:
    int hammingWeight(int n) {
        int result=0;
        while(n)
        {
            n &= (n-1);
            result +=1;
        }
        return result;
    }
};


//cpp code for this one
