package greedy_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class StealGemCapacity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int capacity = scan.nextInt();
        int n = scan.nextInt();

        int[] valueOfGem = new int[n];

        for (int i = 0; i < n; i++) {
            valueOfGem[i] = scan.nextInt();
        }

        int[] weightOfGem = new int[n];
        for (int i = 0; i < n; i++) {
            weightOfGem[i] = scan.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - i - 2; j++) {
                if (valueOfGem[j] / weightOfGem[i] < valueOfGem[j + 1] / weightOfGem[j + 1]) {
                    swapValueArray(valueOfGem, i, j);
                    swapWeightArray(weightOfGem, i, j);
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (weightOfGem[i] <= capacity) {
                max += valueOfGem[i];
                capacity -= weightOfGem[i];
            } else {
                max = max + valueOfGem[i] * (capacity / weightOfGem[i]);
                break;
            }
        }
        System.out.println(max);
    }

    private static void swapWeightArray(int[] weightOfGem, int i, int j) {
        int tempW = weightOfGem[i];
        weightOfGem[i] = weightOfGem[j + 1];
        weightOfGem[j + 1] = tempW;
    }

    private static void swapValueArray(int[] valueOfGem, int i, int j) {
        int tempV = valueOfGem[i];
        valueOfGem[i] = valueOfGem[j + 1];
        valueOfGem[j + 1] = tempV;

    }
}
