package Stacks;

public class Student {
	
	
	String students []= {"a", "b", "c", "d"};

		float payments []=  {2,4,6,8};

	
	int addition = 0;	
	float average; 
	
	float getAverage() {
		float result = 0;
		 for(int i = 0 ; i < payments.length; i++) {
			 addition += payments[i];
		 }
		 result = addition/payments.length;
		 average = result;
		return result; 
		
	}   
	
	float getBiggest() {
		float biggest = 0;
		
		for(int j = 0 ;  j < payments.length; j++) {
			
			if(payments [j] > biggest) {
				biggest = payments [j];
			}
		}		
		
		return biggest;
		
	}
	
	float getDiference() {
		float dif =0;
		
		dif = getBiggest() - 5;
		return dif;
	}
}

