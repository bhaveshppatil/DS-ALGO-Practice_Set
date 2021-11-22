package greedy_algorithm;

import java.util.Scanner;

public class ManageBricks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int currentLayer = 0;
        int prevLayer = arr[0];
        int prevNoOfElements = 1;
        int currentNoOfElements = 0;
        int layers = 1;

        for (int i = 0; i < arr.length; i++) {
            currentLayer += arr[i];
            currentNoOfElements += 1;
        }
        if (currentLayer > prevLayer && currentNoOfElements > prevNoOfElements) {
            prevLayer = currentLayer;
            currentLayer = 0;
            prevNoOfElements = currentNoOfElements;
            currentNoOfElements = 0;
            layers += 1;
        }
        System.out.println(layers);
    }
}
