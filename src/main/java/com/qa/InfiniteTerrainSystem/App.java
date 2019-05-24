package com.qa.InfiniteTerrainSystem;

import java.util.Scanner;

public class App 
{

    public static void main( String[] args )
    {
    	
		Map map = new Map();
		map.getX();
		map.getY();
		map.getActualRow();
		map.getActualCol();
		map.getActualPos();
		map.setX(5);
		map.setY(4);
		map.setActualCol(4, map.getX());
		map.setActualRow(5, map.getY());
		map.getActualPos();
		map.getTreasureSpot();
		
		int north = map.getY() + 1;
		int south = map.getY() - 1;
		int east = map.getX() + 1;
		int west = map.getX() - 1;
    	
        System.out.println( "You find yourself stranded in an open swamp, you have a glowing compass on your wrist. it tells you to move in a direction. what do you coose?(north, east, south, west)");
        
        
		String s = input().toLowerCase();
		boolean treasure = false;
		if (map.getActualPos() == map.getTreasureSpot()) {
			treasure = true;
		}
		else {
			treasure = false;
		}
		while(treasure!= true) {
			System.out.println("please enter a direction to go: ");
		
		if(s.equals("north")|| s.equals("n")) {
			System.out.println("you have chosen to go north");
			System.out.println("---------------------------------------");
			System.out.println("you come across a sword, you pick it up this may help you in the future. ");
			System.out.println("---------------------------------------");
			map.setX(north);
			map.getY();
		
		}
		if(s.equals("south")|| s.equals("s")) {
			System.out.println("you have decided to go south");
			System.out.println("---------------------------------------");
			System.out.println("there is nothing here, try a new direction");
			System.out.println("---------------------------------------");
			map.setX(south);
			map.getY();
		}
		if(s.equals("east")|| s.equals("e")) {
			System.out.println("you have decided to go east");
			System.out.println("---------------------------------------");
			System.out.println("you get stuck in quickmud, quickly pick a new direction.");
			map.setY(east);
			map.getX();
		}
		if(s.equals("west")|| s.equals("w")) {
			System.out.println("you have decided to go west");
			System.out.println("---------------------------------------");
			System.out.println("you edge close to a clue.");
			map.setY(west);
			map.getX();
		}
    }
    }
    
    public static String input() {
    	Scanner s = new Scanner(System.in);
    	String input = s.nextLine();
    	return input;
  }
}
