package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] nums) {
        int last=0;
        List<Integer> list = Arrays.stream(nums).boxed().sorted().filter(x->x>0).toList();
        if ((list.size()==0)||(list.get(0)!=1)){
            return 1;
        }
        for (int i = 0; i < list.size(); i++) {
            last=list.get(i);
            if (!list.contains(last+1)){
               break;
            }

        }
        return last+1;
    }

}