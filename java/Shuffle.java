package javapract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffle {
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4,5,6,7};
		List<Integer> a=new ArrayList<Integer>();
		a.addAll(Arrays.asList(arr));
		Collections.shuffle(a);
		a.toArray(arr);
		System.out.println(Arrays.toString(arr));
	}
}
