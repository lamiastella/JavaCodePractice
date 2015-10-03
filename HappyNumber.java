package microsoft_competition;

import java.util.Scanner;

public class HappyNumber {
	private static int sum=0;
	private static int freq=1;

	public void isHappy(int n){
		return;
	}
	public static void main(String argc[]){
		
		HappyNumber hn=new HappyNumber();
		Scanner sc= new Scanner(System.in);
		
		while (sc.hasNextLine()){			
			String line= sc.nextLine();
			whileLabel: while (true){
				sum=0;
				
				for (int i=0; i<line.length();i++){
					sum+=Math.pow(Integer.parseInt(String.valueOf(line.charAt(i))), 2);
					if (i==line.length()-1){
						line=String.valueOf(sum);
						System.out.println(sum);
						freq++;
					}
					
					if ((i==line.length()-1) && sum==1)
						break whileLabel;
		
			

				}
				
			}
		}
		System.out.println("frequency is:");
		
		sc.close();
		return;
	}

}
