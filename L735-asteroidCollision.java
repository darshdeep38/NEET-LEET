class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for(int i : asteroids)
        {
            while(i < 0 && !stk.empty() && stk.peek() > 0)
            {
                int difference = stk.peek() + i;
                if(difference > 0)
                    i = 0;
                else if(difference < 0)
                {
                    stk.pop();
                }
                else
                {
                    stk.pop();
                    i = 0;
                }
            }
            if(i!= 0)
                stk.push(i);
        }
        int[] result = new int[stk.size()];
        int i = stk.size()-1;
        while(!stk.empty())
        {
            result[i] = stk.pop();
            i--;
        }
        return result;
    }
}

//just simulate

//here is the c++ code buddy

#include <vector>
#include <stack>
using namespace std;
class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        stack<int> stk;
        for (int i : asteroids) {
            while (i < 0 && !stk.empty() && stk.top() > 0) {
                int difference = stk.top() + i;
                if (difference > 0) {
                    i = 0;
                } else if (difference < 0) {
                    stk.pop();
                } else {
                    stk.pop();
                    i = 0;
                }
            }

            if (i != 0) {
                stk.push(i);
        for (int a : asteroids) {
            bool destroyed = false;
            while (!stk.empty() && a < 0 && stk.top() > 0) {
                int diff = stk.top() + a;
                if (diff > 0) {
                    destroyed = true;
                    break;
                } else if (diff < 0) {
                    stk.pop();
                } else {
                    stk.pop();
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                stk.push(a);
            }
        }

        vector<int> result(stk.size());
        for (int i = stk.size() - 1; i >= 0; --i) {
            result[i] = stk.top();
            stk.pop();
        }

        return result;
    }
};

