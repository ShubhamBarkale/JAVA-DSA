import java.util.*;
public class perfect2{
	public static void main(String[] args) {
		perfect2(1,30);
		
	}
	// perfect number of 1 number input
	public static void perfect(int num){
		int perfectnum = 0;
		for(int i=1;i<num;i++){
			if(num%i==0){
				perfectnum = perfectnum + i;
			}
		}
		if(perfectnum==num){
			System.out.println(num + " is a Perfect number");
		}
		else{
				System.out.println(num + " is not a Perfect number");
		}
	}
	
	public static void perfect2(int num1,int num2){
		int perfectnum = 0;
	//	int isperfect = false;
		for(int i=1;i<=num2;i++){
				for(int j=1;j<num1;j++){
					if(num1%j==0){
						perfectnum = perfectnum + j;
					}
				}
				if(perfectnum==num1){
						System.out.println("\tPerfect :"+num1);
					}
					else{
						System.out.println("\tPerfect is not :"+num1);
					}
					
					num1++;
					perfectnum =0;
				
		}
	}
	
}
