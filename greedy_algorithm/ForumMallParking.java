package greedy_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ForumMallParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = 3;

        int[] arrival = new int[n];
        for (int i = 0; i < n; i++) {
            arrival[i] = scan.nextInt();
        }
        int[] departure = new int[n];
        for (int i = 0; i < n; i++) {
            departure[i] = scan.nextInt();
        }
        String output = findParkingSlots(k, arrival, departure);
        System.out.println(output);
    }

    private static String findParkingSlots(int k, int[] arrival, int[] departure) {

        int countVehicle = 0;
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i = 1;
        int j = 0;

        while (i < arrival.length && j < departure.length) {
            if (arrival[i] <= departure[j]) {
                countVehicle++;
                i++;
            } else {
                j++;
                countVehicle--;
            }
        }
        if (countVehicle > k) {
            return "Not Possible";
        }
        return "Possible";
    }
}
