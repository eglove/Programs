import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class SortTree{
	public static void main(String[] args) throws IOException {
		Integer[] integers = new Integer[10];
		BinaryNode<Integer> numTree = new BinaryNode<Integer>(integers);
		int j = 0;		
		
		try{
			Scanner scan = new Scanner(new File("input"));
			while(scan.hasNextInt()) {
				integers[j] = scan.nextInt();
				j++;
		}
		scan.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.print("\n List inorder: ");
		numTree.inorder();
	}
}
