package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }


    /*


    Remeber boys to import ArrayList!:-)


     */


    class Solution {
        public int solution(int N) {

            int howManyOnes = 0;
            String binaryFormOfN = Integer.toBinaryString(N);
            ArrayList <Integer> howManyZeros = new ArrayList<Integer>();

            for (int i = 1; i < binaryFormOfN.length(); ++i) {
                if (binaryFormOfN.charAt(i) == '0') {
                    howManyOnes++;
                }

                else{
                    howManyZeros.add(howManyOnes);
                    howManyOnes = 0;
                }
            }

            int highestValue = 0;
            for (int i = 0; i < howManyZeros.size(); ++i ){
                if (howManyZeros.get(i)> highestValue) {
                    highestValue = howManyZeros.get(i);
                }
            }
            return highestValue;
        }
    }
}
