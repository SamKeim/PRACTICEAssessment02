package co.grandcircus;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class AssessmentPractice {
	public static Map<Integer, String> espanol(){
		TreeMap<Integer, String> translator = new TreeMap<>(Map.of(1, "Uno", 2, "Dos", 3, "Tres"));
		return translator;
	}
	
	public static int lift(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			words.set(i, words.get(i).toUpperCase());
		}
		return words.size();
	}
	
	public static boolean takeItAway(Map<String, String> map, String it) {
		if (map.remove(it) != null) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static Set<String> listToSet(List<String> userList){
		Set<String> returnSet = new HashSet<String>();
		for (int i = 0; i < userList.size(); i++) {
			returnSet.add(userList.get(i));
		}
		return returnSet;
	}
	
	public static int howFarApart(List<String> userList, String first, String second) throws IllegalArgumentException {
		if (!userList.contains(first) || !userList.contains(second)) {
			throw new IllegalArgumentException();
		}
		
		int indexFirst = userList.indexOf(first);
		int indexSecond = userList.indexOf(second);
		
		return indexSecond - indexFirst;		
	}
	
	public static double makeADifference(double[] arr, int a, int b) {
		try {
			return arr[a] - arr[b];
		} catch (Exception e) {
			return 0;
		}
	}
	
	public static Set<Integer> neverTellMeTheOdds(int[] arr){
		Set<Integer> returnSet = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				returnSet.add(arr[i]);
			}
		}
		
		return returnSet;
	}
	
	public static int fleeZero(int[] arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				arr[i] += 1;
				counter++;
			} else if (arr[i] < 0) {
				arr[i] -= 1;
			}
		}
		return counter;
	}
}
