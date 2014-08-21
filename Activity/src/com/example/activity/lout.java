package com.example.activity;

public class lout {
	
public static void main(String[] args) {
		
		int[] array = {1,12,23,34,42,55,89,120,330};
		
		System.out.println(findNum(55, array));
	}
	/**在数组中查找num是否存在，如果存在就返回num在数组中的位置，不存在就返回-1**/
	public static int  findNum(int num,int[] array){
		int start = 0;
		int end = array.length - 1;
		while(start <= end){
			int middle = (start+end)/2;
			if(num > array[middle]){
				start = middle+1;
			}else if(num < array[middle]){
				end = middle-1;
			}else{
				return middle;
			}
		}
		return -1;
	}


}
