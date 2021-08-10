package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int total = 0;
        int x = 0,k = 2, n = 4;
        int[] arr = {1, 3, 2, 4};

        System.out.println(leastCost(n - 1, x, total, arr, 0));
    }

    public static int leastCost(int n, int x, int total, int[] arr, int i){
        if (n <= 0){
            return total;
        }

        total = ((x + 1) * arr[i]);

        return leastCost(n-x, x + 1, total, arr, i + 1);
    }
}
