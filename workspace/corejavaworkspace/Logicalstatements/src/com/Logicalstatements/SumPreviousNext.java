
package com.Logicalstatements;

public class SumPreviousNext {

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,60};

        int num=0;
        int result[] = new int[arr.length];

        for(int i=0; i<arr.length; i++) {

            if(i == 0) {
                num = arr[i] + arr[i+1];
                result[i]=num;
            }
            else if(i == arr.length-1) {
                num = arr[i-1] + arr[i];
                result[i]=num;
            }
            else {
            	num=arr[i+1]+arr[i-1];
            	result[i]=num;
            }System.out.println(result[i]);
        }
    }
}

