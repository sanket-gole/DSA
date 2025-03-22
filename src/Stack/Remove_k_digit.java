//        Example 1:
//
//        Input: num = "1432219", k = 3
//        Output: "1219"
//        Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
//        Example 2:
//
//        Input: num = "10200", k = 1
//        Output: "200"
//        Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
//        Example 3:
//
//        Input: num = "10", k = 2
//        Output: "0"
//        Explanation: Remove all the digits from the number and it is left with nothing which is 0.


        package Stack;

import java.util.Stack;

public class Remove_k_digit {
    public static void main(String[] args) {

    }

    public String removeKdigits(String num, int k) {
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            int  digit = num.charAt(i)-'0';

            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        return result.length() == 0 ? "0" : result.toString();
    }
}
