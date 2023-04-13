package Scheme;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solve27 {
    public static void main(String[] args) throws IOException {
        solve("C:\\Users\\loban\\IdeaProjects\\Matrix\\src\\Scheme\\27_A.txt");
        solve("C:\\Users\\loban\\IdeaProjects\\Matrix\\src\\Scheme\\27_B.txt");
    }

    static void solve(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int n = Integer.parseInt(reader.readLine());
        int[] tubes = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            st.nextToken();
            tubes[i] = Integer.parseInt(st.nextToken());
        }
        reader.close();

        long left = 0, right = n - 1;
        while (right - left > 1) {
            long mid = (left + right) / 2;
            if (cost(tubes, mid) < cost(tubes, mid + 1)) {
                right = mid;
            } else {
                left = mid;
            }
        }

        System.out.println(Math.min(cost(tubes, left), cost(tubes, right)));
    }

    static long cost(int[] tubes, long pos) {
        long cost = 0;
        for (int i = 0; i < tubes.length; i++) {
            cost += Math.abs(i - pos) * ((tubes[i] + 35) / 36);
        }
        return cost;
    }
}
