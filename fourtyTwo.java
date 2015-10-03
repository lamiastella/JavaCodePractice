package microsoft_competition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class fourtyTwo {
	
	public static void main(String[] argc) throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> buff=new ArrayList<String>();
		String line=null;
		while((line=br.readLine())!=null ){
			if (Integer.parseInt(line)==42)
				break;
			buff.add(line);
		}
		
		for (int i=0; i<buff.size(); i++){
			System.out.println(buff.get(i));
		}
	}

}
