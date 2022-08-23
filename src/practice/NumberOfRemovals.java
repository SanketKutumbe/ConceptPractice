package practice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Stack;

/*
    i/p: aba
    o/p: 1

    Explaination: If we have a and b adjacent to each other, remove both of them. Count such number of removals

    i/p: aabb
    o/p: 2
 */
public class NumberOfRemovals {

    public static void main(String[] args) {

        String str = "aababb";
        char[] arr = str.toCharArray();
        Stack<Character> stack = new Stack();
        stack.push(arr[0]);
        char ch;
        int counter = 0;

        for(int i = 1; i < arr.length; i++)
        {
            ch = stack.peek();
            if( ch != arr[i] ) {
                stack.pop();
                counter++;
            }
            else
                stack.push(ch);

           }
        System.out.println(counter);

    }
}
