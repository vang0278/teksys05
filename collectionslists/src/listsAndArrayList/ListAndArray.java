package listsAndArrayList;

import java.time.DayOfWeek;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.EnumMap;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.List;

import java.util.*;

public class ListAndArray {

	public static void main(String[] args) {
		{
			List<Integer> myNumberList;
			myNumberList = new ArrayList<>();

			ArrayList<String> myStringArrayList = new ArrayList<>();

			for (int i = 0; i < 100; i++) {
				myStringArrayList.add("" + i);
				myNumberList.add(i);
			}

			System.out.println(myNumberList.size());
			System.out.println(myNumberList.indexOf(50));
			System.out.println(myNumberList.contains(80));
			System.out.println(myNumberList.contains(180));
			boolean success = myNumberList.remove((Integer) 80);
			System.out.println(success);
			System.out.println("C:" + myNumberList.contains(80));
			System.out.println("C:" + myNumberList.contains(180));
			success = myNumberList.remove((Integer) 180);
			System.out.println(success);
			System.out.println(myNumberList.indexOf(80));
			System.out.println(myNumberList.size());

		}

		{

			ArrayList<Integer> myNumberList = new ArrayList<>();
			int sum = 0;

			for (int i = 0; i < 10; i++) {
				myNumberList.add(i);
			}

			for (Integer i : myNumberList) {
				sum += i;
			}
			System.out.println("My sum: " + sum);

			myNumberList.sort((x, y) -> x.compareTo(y));
			System.out.println(myNumberList);
			myNumberList.sort((y, x) -> x.compareTo(y));
			System.out.println(myNumberList);

		}

		{
			List<Double> listOfDoubles = Arrays.asList(2.0, 2.7, 6.0,3.0);
			System.out.println(listOfDoubles.getClass().getName());
			List<Integer> myNumberList = new ArrayList<>();
			System.out.println(myNumberList.getClass().getName());
			myNumberList = Arrays.asList(2, 2, 6, 3);
			System.out.println(myNumberList.getClass().getName());
			
			List<String> str = new ArrayList<>();
			str.add("a string");
			System.out.println(str.get(0));
			System.out.println(str.getClass().getName());
		}
		
		
		{
			List<Integer> myNumberList = Arrays.asList(2, 2, 6, 3);
			System.out.println(myNumberList.getClass().getName());
			LinkedList<Integer> linkOne = new LinkedList<>(myNumberList);
			System.out.println(linkOne.getClass().getName());
			
			linkOne.add(23);
			System.out.println(linkOne);
			linkOne.add(12);
			System.out.println(linkOne);
			linkOne.add(4,46);
			System.out.println(linkOne);
			System.out.println(linkOne.get(4));
			linkOne.set(0, 98);
			System.out.println(linkOne);
			System.out.println(linkOne.indexOf(12));
			System.out.println(linkOne.size());
			linkOne.remove(2);
			System.out.println(linkOne);
			System.out.println(linkOne.size());
			System.out.println(linkOne.contains(23));

			
//			int [] test = new int[] {1,2,3,4,5,6};
//			LinkedList<Integer> linkTest = new LinkedList<>(test);
			
			//map
			
			EnumMap<DayOfWeek, Integer> map = new EnumMap<>(DayOfWeek.class);
			map.put(DayOfWeek.FRIDAY, 23);
			
			HashMap<Integer, String> cars = new HashMap<>();
			cars.containsValue(cars);
			cars.containsKey(cars);

		}
		
		
		{
//			Set
			HashSet<String> setHashList = new HashSet<>();
			
			setHashList.add("one");
			setHashList.add("Two");
			setHashList.add("Erik");
			setHashList.add("Sara");
			setHashList.add("Two");
			setHashList.add("one");
			
			System.out.println(setHashList);
			
			Iterator<String> itr =setHashList.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}

			
		}

	}

}
