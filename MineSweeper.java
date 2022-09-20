package minesweeper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Satır sayısını giriniz : ");
		int row = scan.nextInt();
		System.out.println("Sütun sayısını giriniz : ");
		int column = scan.nextInt();
		
		int[][] minesweeper = new int[row][column];
		
		int mine = (row*column)/4;

		Random random = new Random();   
		for(int i = 0; i < mine; i++) {
			int rrow = random.nextInt(row); 
			int rcolumn = random.nextInt(column); 
			
			minesweeper[rrow][rcolumn] = 9; 
		}

		for(int x = 0; x < row; x++) {
			for(int y = 0; y < column; y++) {
				
				int total = 0;

                for(int k = 0; k < findNeighbors(x,y,minesweeper,row,column).size(); k++) {

                    if(findNeighbors(x,y,minesweeper,row,column).get(k) == 9) total +=1;
                }
				
				if(total > 0) {
					minesweeper[x][y] = total;
				}				 
			}
		}
		System.out.println("Mayınların konumu");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				if(minesweeper[i][j] == 9) System.out.print("* ");
				else System.out.print("- ");
			}
			System.out.println();
		}
		System.out.println("==================================");
		System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz ! ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++)
				System.out.print("-");
			System.out.println();
		}
		int[][] visit = new int[row][column];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				visit[i][j] = minesweeper[i][j];
			}

		}
		
		int number = 0;
		int r;
		int c;
		
		while(number != 9) {
			
			System.out.println("Satır Giriniz : ");
			r = scan.nextInt();
			System.out.println("Sütun Giriniz : ");
			c = scan.nextInt();
			System.out.println("===================================");
			if(minesweeper[r][c] == 9) {
				System.out.println("Game Over! !");
				break;
			}
			else {
				for(int i = 0; i < row; i++) {
					for(int j = 0; j < column; j++) {
						if(i == r && j == c) System.out.print(minesweeper[r][c]+" ");
						else if(visit[i][j] == 100) System.out.print(minesweeper[i][j]+" ");
						else System.out.print("- ");
					}
					System.out.println();
				}
				visit[r][c] = 100;
			}
			int counter = 0;
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < column; j++) {
					if(visit[i][j] == 100 || visit[i][j] == 9) counter++;
				}
			}
			
			if(counter == (row*column)) {
				System.out.println("Oyunu Kazandınız ! ");
				break;
			}
			
			
		}
		
		
	}
	
	public static List<Integer> findNeighbors(int x, int y, int[][] arr,int row,int column){
		List<Integer> neighbors = new ArrayList<>();
		
		// sss    
		// sxs
		// sss
		
		int[] points = new int[] { 
			  
				-1,-1,
				-1,0,
				-1,1,
				
				0,-1,
				0,1,
				
				1,-1,
				1,0,
				1,1
		};
		
		for (int i = 0; i < points.length; i++) { 
			int dx = points[i];
			int dy = points[++i];
			
			int neighborX = x + dx; 
			int neighborY = y + dy;
			
		
			
			if(neighborX >= 0 && neighborX < row && neighborY >= 0 && neighborY < column) {
				neighbors.add(arr[neighborX][neighborY]);
			}
		} 
		return neighbors;
	}


}
