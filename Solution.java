import java.util.ArrayList;

public class Solution {
		
	public String countAndSay(int n) {

        
		String number = "1";
		
		for(int i = 0; i < n - 1;i++) {
			
			number =  createNewInteger(pairs(number));
			
		}
	
	return number;
    }
	
	public String createNewInteger(ArrayList<String[]> arr) {
		
		String number = "";
		
		for(int i = 0; i < arr.size();i++) {
			
			for(String j : arr.get(i)) {
				number = number + j;
			}
			
		}
		
		return number;
	}	
	
	public ArrayList<String[]> pairs(String number){
		
		int sizeOfString = number.length();
		int numberOfRepeat = 0;
		ArrayList<String[]> arr = new ArrayList<>();
		int indexOfArray = 0;
		for(int i = 0;i < sizeOfString;i++) {
			
			char a = number.charAt(i);
			numberOfRepeat++;
			
			if((i + 1) != sizeOfString) {
				if(a != number.charAt(i+1)) {
					
					String[] e = {Integer.toString(numberOfRepeat), Character.toString(a)};
					arr.add(indexOfArray, e);;
					indexOfArray++;
					numberOfRepeat = 0;
				}
			}
			else {
				String[] e = {Integer.toString(numberOfRepeat), Character.toString(a)};
				arr.add(indexOfArray, e);;
				indexOfArray++;
				numberOfRepeat = 0;
			}
			
		}
		return arr;
	}

	
}
