package com.practice.ds;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class IDList {
	public static ArrayList<Integer> numList = new ArrayList<>();
	
	public static void main(String [] args){
		
		Scanner sc= new Scanner(System.in);
		
		int length = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<length;i++)
			numList.add(sc.nextInt());

		int queries = sc.nextInt();
		sc.nextLine();
		String queryType ="";
		String insertElemnt = "";
		int index;
		int value;
		for(int j = 0; j<queries; j++){
			queryType = sc.nextLine();
			
			/*switch (queryType.toLowerCase()){
			case "insert":
				
			}*/
			if(queryType.equalsIgnoreCase("Insert")){
				insertElemnt = sc.nextLine();
				StringTokenizer st1 = new StringTokenizer(insertElemnt, " ");
				index = Integer.parseInt(st1.nextToken());
				value = Integer.parseInt(st1.nextToken());
				updateList(index,value);
				
			}
			else if(queryType.equalsIgnoreCase("Delete")){
				index = sc.nextInt();
				updateList(index);
			}
			
		}
		for (Integer a : numList) {
			System.out.print(a +"\t");
		}
		/*System.out.println("NumList::  "+ numList);*/
		sc.close();
		
		
	}
	public static void updateList(int index, int value){
		int size = numList.size();
		if(index >=0 && size >index){
			for(int i = size; i>index;i--){
				if(i==size)
				numList.add(i, numList.get(i-1));
				else
					numList.set(i, numList.get(i-1));
			}
			
			numList.add(index, value);
		}
		else if(size == index)
				numList.add(value);
	}

	public static void updateList(int index){
		int size = numList.size();
		if(index >=0 && size >index){
			numList.remove(index);
		}
		
			
		}
		
	

}

