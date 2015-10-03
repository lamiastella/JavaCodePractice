package microsoft_competition;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {

	public void swap(int a, int b){
/*
		int temp;
		temp=a;
		a=b;
		b=temp;
*/
	}
	

	public void bubbleSort(int[] a){
		boolean flag=true;
		int temp;
		while (flag){
			flag=false;
			for (int i=0; i<a.length-1; i++)
				//for (int j=i; j<a.length; j++ )
			
				if (a[i]>a[i+1]){
					//swap(a[i],a[i+1]);
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					flag=true;
				}
			
		}

	}

	public static void main(String argc[]){
		BubbleSort bs= new BubbleSort();
	    
		ArrayList<Integer> numList= new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(" ");
		String sc_in= sc.nextLine();
		String[] sc_split=sc_in.split(" +");
		for (int i=0; i<sc_split.length; i++){
			numList.add(Integer.parseInt(sc_split[i]));
		}
		int[] numArr= new int[numList.size()];
		for (int i=0; i<numList.size(); i++){
			numArr[i]= numList.get(i);
		}
		
		bs.bubbleSort(numArr);
		for (int i=0; i<numArr.length;i++)
			System.out.println(numArr[i]);
		sc.close();
		return;
	}
}
