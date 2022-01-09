package com.company.bosscoder.dsa;

import java.util.*;

public class Sample {


    private static  List<Integer> nextGreaterElement(List<Integer> numList){

        Stack<Integer> stack = new Stack<>();
        List<Integer> answerList = new ArrayList<>();
        Integer number;
       // Collections.fill(answerList,-1);
        for(int i=0; i<numList.size(); i++){

            number =  numList.get(i);


            while(!stack.isEmpty() && numList.get(stack.peek()) < number){
                int j= stack.pop();
                answerList.remove(j);


            }
            stack.push(i);
            answerList.add(i,-1);
        }

        return answerList;
        // add indexes
        // 01234
        // 13426
        // 1 -> stack.push(i) --> ans[i] =-1
        // 3 --> while(numList.get(i) > arr[stack.top()]) stack.pop() --> ans[i] = arr[i]
        // stack.push(i)

    }
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,3,4,2,6);

        System.out.println(nextGreaterElement(numList));

    }
}
