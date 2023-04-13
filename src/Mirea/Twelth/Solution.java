package Mirea.Twelth;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int[] arr = new int[10];
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - '0']++;
        }
        String res1 = a;
        String res2 = a;
        int maxZeros = 0;
        for (int i = 1; i < 6; i++) {
            if (arr[i] != 0 && arr[10 - i] != 0) {
                StringBuilder builder1 = new StringBuilder(Integer.toString(i));
                StringBuilder builder2 = new StringBuilder(Integer.toString(10 - i));
                int[] dupArrH = Arrays.copyOf(arr, arr.length);
                int[] dupArrB = Arrays.copyOf(arr, arr.length);
                dupArrH[i]--;
                dupArrB[10 - i]--;
                int ninePairs = 0;
                for (int k = 0; k < 10; k++) {
                    if (dupArrH[k] != 0 && dupArrB[9 - k] != 0) {
                        int temp = Math.min(dupArrH[k], dupArrB[9 - k]);
                        builder1.append(Integer.toString(k).repeat(temp));
                        builder2.append(Integer.toString(9 - k).repeat(temp));
                        ninePairs += temp;
                        dupArrH[k] -= temp;
                        dupArrB[9 - k] -= temp;
                    }
                }
                int tenPairs = 0;
                for (int k = 1; k < 10; k++) {
                    if (dupArrH[k] != 0 && dupArrB[10 - k] != 0) {
                        tenPairs = 1;
                    }
                }
                int lessNinePairs = 0;
                for (int k = 1; k < 10; k++) {
                    for (int l = 8 - k; l > 0; l--) {
                        if (dupArrH[k] != 0 && dupArrB[l] != 0) {
                            lessNinePairs = 1;
                            break;
                        }
                    }
                }
                if (ninePairs + Math.min(lessNinePairs, tenPairs) + Math.min(dupArrH[0], dupArrB[0]) + 1 > maxZeros) {
                    maxZeros = ninePairs + Math.min(tenPairs, lessNinePairs) + Math.min(dupArrH[0], dupArrB[0]) + 1;
                    builder1.reverse();
                    builder2.reverse();
                    int temp = Math.min(dupArrH[0], dupArrB[0]);
                    builder1.append("0".repeat(temp));
                    builder2.append("0".repeat(temp));
                    dupArrH[0] -= temp;
                    dupArrB[0] -= temp;
                    for (int p = 0; p < dupArrH.length; p++) {
                        builder1 = new StringBuilder(Integer.toString(p).repeat(dupArrH[p]) + builder1);
                    }
                    for (int p = 0; p < dupArrB.length; p++) {
                        builder2 = new StringBuilder(Integer.toString(p).repeat(dupArrB[p]) + builder2);
                    }
                    res1 = builder1.toString();
                    res2 = builder2.toString();
                }
            }
        }
        if (maxZeros == 0) {
            res1 = res1.replaceAll("0", "") + "0".repeat((int) res1.codePoints().filter(ch -> ch == '0').count());
            res2 = res1;
        }
        System.out.println(res1);
        System.out.println(res2);
    }
}