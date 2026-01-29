/**
 * V al id Su do ku
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Summarize the core trick you used (2â€“3 bullets) after solving once.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: DSA
 */
package problem75LC;

import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for(int i = 0; i < rows; i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0; j < cols; j++){
                if(Character.isDigit(board[i][j]) && !set.add(board[i][j])) return false;
            }
        }

        for(int j = 0; j < cols; j++){
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < rows; i++){
                if(Character.isDigit(board[i][j]) && !set.add(board[i][j])) return false;
            }
        }

        Map<String, Set<Character>> map = new HashMap<>();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                char current = board[i][j];
                if(current == '.') continue;
                String pos = i/3 + "," + j/3;
                map.putIfAbsent(pos, new HashSet<>());
                if(!map.get(pos).add(current)) return false;
            }
        }

        return true;
    }
    public boolean isValidSudokuII(int[][] board){

        int rows = board.length;
        int cols = board[0].length;

        for(int i = 0; i < rows; i++){
            Set<Character> set = new HashSet<>();
            for(int j = 0; j < cols; j++){
                if(Character.isDigit(board[i][j]) && !set.add(board[i][j])) return false;
            }
        }

        // Check Cols
        for(int j = 0; j < cols; j++){
            Set<Character> set = new HashSet<>();
            for(int i = 0; i < cols; i++){
                if(Character.isDigit(board[i][j]) && !set.add(board[i][j])) return false;
            }
        }

        for(int k=0; k<9; k++){
            Set<Character> set = new HashSet<>();

            int rowStart = (k/3) * 3;
            int colStart = (k%3) * 3; 

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    char current = (char) board[rowStart + i][colStart + j];
                    
                    if (Character.isDigit(current) && !set.add(current)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public boolean isValidSudokuIII(char[][] board){
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                int num = board[i][j] - '1';
                int box = (i/3)*3 + (j/3);

                if(rows[i][num] || cols[j][num] || boxes[box][num]) return false;

                rows[i][num] = cols[j][num] = boxes[box][num] = true;
            }
        }

        return true;
    }
}

