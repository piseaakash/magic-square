package nisum.problem;

import java.util.Scanner;

public class Solution {
	
	/*
	 * Returns all the possible magic squares
	 */
	private static int[][][] getPossibleMagicSquares() {
		int[][][] possibleMagicSquares = {
	        	{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
	        	{{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
	        	{{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
	        	{{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
	        	{{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
	        	{{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
	        	{{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
	        	{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
	        };
		return possibleMagicSquares;
	}
	
	/*
	 * Get input via scanner and return the given input matrix
	 */
	private static int[][] getInputMatrix() {
		Scanner scannerInput = new Scanner(System.in);
        
        int[][] input = new int[3][3];
        for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++)
        		input[i][j] = scannerInput.nextInt();
        }
        scannerInput.close();        
        return input;
	}
	
	/*
	 * Return the minimum cost to get a magic square
	 */
	public static int printMinimumCostToConvertToMagicSquare() {
		int[][] input = getInputMatrix();
		int[][][] possibleMagicSquares = getPossibleMagicSquares();
		int minCost = Integer.MAX_VALUE;
        for (int k = 0; k < 8; k++) {
            int possibleCost = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++)
                    possibleCost = possibleCost + Math.abs(input[i][j] - possibleMagicSquares[k][i][j]);
            }
            minCost = Math.min(minCost, possibleCost);
        }
        return minCost;
	}
	
	public static void main(String[] args) {
		System.out.println(Solution.printMinimumCostToConvertToMagicSquare());        
	}
}
