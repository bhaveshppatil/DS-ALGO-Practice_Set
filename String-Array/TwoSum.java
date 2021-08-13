import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();
            int target = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            int[] res = new int[2];
            int count =0;
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();

            for(int i=0;i<arr.length;i++){
                int find = target - arr[i];

                if(map.containsKey(find)){
                    res[0] = map.get(find);
                    res[1] = i;
                    count++;
                }
                else{
                    map.put(arr[i],i);
                }
            }

            for (Map.Entry<Integer, Integer> hashmap : map.entrySet()){
                System.out.println(hashmap.getKey() + " " + hashmap.getValue());
            }

        }
    }
}

/*
int[] count = new int[0];
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == target) {
                        count = new int[]{i,j};
                    }
                }
            }

            if (count.length  == 2){
                System.out.println(count[0] + " " + count[1]);
            }else {
                System.out.println(-1  + " " + -1);
            }
 */