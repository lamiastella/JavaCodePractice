package microsoft_competition;

import java.util.ArrayList;
import java.util.Scanner;

public class StringWordReverse {

	public String[] StringToWord(){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(" ");
		ArrayList<String> wordList= new ArrayList<String>();
		String sc_in= sc.nextLine();
		String[] sc_split=sc_in.split(" +");
		for (int i=0; i<sc_split.length; i++){
			wordList.add(sc_split[i]);
		}
		
		String[] stringArr= new String[wordList.size()];
		for (int i=0; i<wordList.size(); i++){
			stringArr[i]= wordList.get(i);
		}
		return stringArr;
		
		
	}
	
	public String[] reverseWords(String[] words){
		Stack<String> s= new Stack<String>();
		String[] outStr=new String[words.length];
		for (int i=0; i<words.length; i++){
			s.push(words[i]);
		}
		for (int i=0; i<words.length; i++){
			System.out.println(s.stackSize());
			outStr[i]=(String) s.pop();
		}
		
		return outStr;	
		
	}
	
	public static void main(String[] argc){
		StringWordReverse swr = new StringWordReverse();
		
		
		String[] inputWords= swr.StringToWord();
		String[] outputWords=swr.reverseWords(inputWords);
		for (int i=0; i<outputWords.length;i++)
			System.out.println(outputWords[i]);
		
		
		return;
	}
	
	
	
}
