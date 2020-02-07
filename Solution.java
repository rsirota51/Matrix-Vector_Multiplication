package ub.cse.algo;

import java.util.Arrays;
import java.util.Vector;
import java.util.ArrayList;

public class Solution {
    
    private ArrayList<Integer> in_vector;
    
    /**
     * The constructor simply sets up the necessary data structures.
     * The grader for the homework will first call this class and pass the necessary variables.
     * There is no need to edit this constructor.
     *
     * @param in_vector the vector used to multiply against the matrix
     */
    public Solution(ArrayList<Integer> in_vector) {
        this.in_vector = in_vector;
    }
    
    /**
     * This method must be filled in by you. You may add other methods and subclasses as you see fit,
     * but they must remain within the Solution class.
     * @return Your resulting vector.
     */
    public ArrayList<Integer> outputVector() {

        ArrayList<Integer> answer = new ArrayList<Integer>();
    	int value = 0;
    	for(int x = 0; x < in_vector.size(); x++){
    		value += in_vector.get(x);
    	}
    	answer.add(value);
    	for(int y = 0; y < in_vector.size(); y++){
    		value -= in_vector.get(y);
    		answer.add(value);
    	}
    	answer.remove(answer.size() - 1);
        return answer;
    

    }
}
