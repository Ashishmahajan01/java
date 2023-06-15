package Array;

import java.util.ArrayList;

public  class Trapping_RainWater {
	
	public static int trap(int[] height) {
        int max = 0;
		int counter = -1;
		int maxind = 0;
		for (int i : height) {
			counter++;
			if (i > max) {
				max = i;
				maxind = counter;
			}

		}

		int maxlen = height.length;
		ArrayList<Integer> al = new ArrayList<>();
		int tempmax = 0;
		for (int i = 0; i < maxind; i++) {
			if (height[i] > tempmax) {
				tempmax = height[i];
				continue;
			}
			al.add(tempmax - height[i]);
		}

		if (maxind < maxlen) {
			tempmax = 0;
			for (int i = maxlen - 1; i > maxind; i--) {
				if (height[i] > tempmax) {
					tempmax = height[i];
					continue;
				}
				al.add(tempmax - height[i]);
			}
		}
		
		int total =0;
		for(int i: al) {
			total +=i;
		}
		return total;
    }

	public static void main(String[] args) {
		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(arr));

	}

}
