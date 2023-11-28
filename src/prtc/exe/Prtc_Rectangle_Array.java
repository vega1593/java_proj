package prtc.exe;

import java.util.Arrays;

public class Prtc_Rectangle_Array {

	public static void main(String[] args) {
		
		
		int [][]arr = new int[2][8];		//2의 배수를 뺴고 넣으시오
		
		System.out.println(arr.length);
		
		for (int i = 0 ; i < arr.length; i++) {
			if (i == 0) {
				int a = 2;
				for(int j = 0 ; j < arr[i].length; a++){
					if(a % 2 != 0) {				
						arr[i][j] = a;
							j++;							
					}				
				}
				
			}

		}
		System.out.println(Arrays.toString(arr[0]));
	}
				}
				
