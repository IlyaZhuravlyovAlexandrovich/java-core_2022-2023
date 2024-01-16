package task_2109;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the number of cities
            int n = scanner.nextInt();

            // Create an array to store the roads
            List<List<Integer>> roads = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                roads.add(new ArrayList<>());
            }

            // Read the roads
            for (int i = 0; i < n - 1; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                roads.get(u).add(v);
                roads.get(v).add(u);
            }

            // Read the number of tourist routes
            int q = scanner.nextInt();

            // Read and process each tourist route
            for (int i = 0; i < q; i++) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                int mainAttraction = findMainAttraction(roads, l, r);
                System.out.println(mainAttraction);
            }
        }

        private static int findMainAttraction(List<List<Integer>> roads, int l, int r) {
            boolean[] visited = new boolean[roads.size()];
            int[] distances = new int[roads.size()];
            dfs(roads, visited, distances, 1, 0);

            int mainAttraction = l;
            int maxDistance = distances[l];

            for (int i = l + 1; i <= r; i++) {
                if (distances[i] > maxDistance) {
                    mainAttraction = i;
                    maxDistance = distances[i];
                }
            }

            return mainAttraction;
        }

        private static void dfs(List<List<Integer>> roads, boolean[] visited, int[] distances, int current, int distance) {
            visited[current] = true;
            distances[current] = distance;

            for (int neighbor : roads.get(current)) {
                if (!visited[neighbor]) {
                    dfs(roads, visited, distances, neighbor, distance + 1);
                }
            }
        }
    }
