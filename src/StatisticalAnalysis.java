import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StatisticalAnalysis {

	public static void println(Object line) {
		System.out.println(line);
	}

	public static void print(Object line) {
		System.out.print(line);
	}

	/**
	 * READ FUNCTION
	 * 
	 * @param fileName
	 * @param grades
	 */
	public static void populateGrades(String fileName, ArrayList<Integer> grades) {
		try {
			Scanner read = new Scanner(new File(fileName));
			do {
				String line = read.nextLine();
				grades.add(Integer.parseInt(line));
			} while (read.hasNext());
			read.close();
		} catch (FileNotFoundException fnf) {
			System.out.println("File was not found");
		}
	}

	/*
	 * public static void write(String fileName) { try { PrintWriter writer = new
	 * PrintWriter(fileName); for (int i = 1; i <= 10; i++) { writer.println(i); }
	 * writer.close(); } catch (FileNotFoundException fnf) {
	 * System.out.println("File was not found"); } }
	 */

	public static void displayGrades(ArrayList<Integer> grades) {
		for (int i = 1; i < grades.size() + 1; i++) {
			if (i % 5 != 0)
				print(grades.get(i - 1) + ", ");
			else
				println(grades.get(i - 1));
		}
	}

	public static ArrayList<Integer> sortList(ArrayList<Integer> grades) {
		ArrayList<Integer> list = grades;
		for (int i = 0; i < list.size(); i++) {
			int lowest = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j) < list.get(lowest)) {
					lowest = j;
				}
			}
			int swap = list.get(i);
			list.set(i, list.get(lowest));
			list.set(lowest, swap);
		}
		return list;
	}
	
	public static int sum(ArrayList<Integer> grades) {
		int sum = 0;
		for (int i = 0; i < grades.size(); i++) {
			sum += grades.get(i);
		}
		return sum;
	}
	
	public static int maxValue(ArrayList<Integer> arrayList) {
		int max = arrayList.get(0);
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) > max)
				max = arrayList.get(i);
		}
		return max;
	}

	public static double median(ArrayList<Integer> grades) {
		ArrayList<Integer>list = sortList(grades);
		double median;
		if (list.size() % 2 == 0)
		    median = ((double)list.get(list.size() /2) + (double)list.get(list.size()/2 - 1))/2;
		else
		    median = (double)list.get(list.size() /2);
		return median;
	}
	
	public static ArrayList<Integer> mode(ArrayList<Integer> grades) {
		ArrayList<Integer>modeList = new ArrayList<Integer>();
		int tmp = grades.get(0);
		modeList.add(tmp);
		for (int i = 1; i < grades.size(); i++) {
			tmp = grades.get(i);
			if (tmp != grades.get(i - 1))
				modeList.add(tmp);
		}
		return modeList;
	}
	
	public static void main(String[] args) {
		String fileName = "Grades.txt";
		ArrayList<Integer> grades = new ArrayList<Integer>();
		populateGrades(fileName, grades);
		println(sortList(grades));
		println(sum(grades));
		println(maxValue(grades));
		println(median(grades));
		displayGrades(mode(grades));
	}

}
