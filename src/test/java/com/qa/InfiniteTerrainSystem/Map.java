package com.qa.InfiniteTerrainSystem;

public class Map {

	private int[][] mapCo =  {
			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
			{21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
			{31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
			{41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
			{51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
			{61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
			{71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
			{81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
			{91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
			
	};
		private int x = 5;
		private int y = 4;
		private int actualRow = x;
		private int actualCol = y;
		private int actualPos = mapCo[x][y];
		private int treasureSpot;
		
		public Map() {			
			
			
		}
//		public int[][] getMapCo(){
//			return mapCo;	
//		}
		public int getActualRow() {
			return actualRow;		
		}
		public int getActualCol() {
			return actualCol; 
		}
		public int getActualPos() {
			return actualPos; 
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public int getTreasureSpot() {
			return treasureSpot;
		}
//		public int[][] getStartingPos() {
//			return startingPos;
//		}
//		public int[][] setStartingPos(int[][] startingPos) {
//			return startingPos = setStartingPos([5][5]) ;
//		}
		public int setX(int i) {
			return x ;
		}
		public int setY(int i) {
			return y ;
		}
		public int setActualRow(int actualRow, int x) {
			return actualRow = x;
		}
		public int setActualCol(int actualColumn, int y) {
			return actualColumn = 5;
		}
		public int setActualPos(int actualPos) {
			return actualPos = mapCo[x][y];
		}
		public int setTreasureSpot(int treasureSpot) {
			return treasureSpot = 78;
		}
		

		
	} 

