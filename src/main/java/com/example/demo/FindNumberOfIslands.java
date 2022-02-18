package com.example.demo;

public class FindNumberOfIslands {

    static void dfs(Character[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c].equals('0') ) {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public static int numIslands(Character[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        Character island = '1';
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c].equals(island)) {
                    ++num_islands;
                    dfs(grid, r, c);
                }

            }
        }

        return num_islands;
    }

    public static void main(String[] args) {
        Character grid[][] = {{'1', '1', '0', '0', '0'},
                              {'0', '1', '0', '0', '1'},
                              {'1', '0', '0', '1', '1'},
                              {'0', '0', '0', '0', '0'},
                              {'1', '0', '1', '1', '0'}};

        System.out.println(numIslands(grid));
    }
}
