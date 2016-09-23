package stringToInteger_atoi;

public class ATOI {

	public static int atoi(String str){
		if(str == null || str.length() == 0)
			return 0;
		int temp = 0;
		int sum = 0;
		int lastValidInt = str.length() ;
		for (int i = str.length() - 1; i >=0 ; --i){
			if(str.charAt(i) > 47 && str.charAt(i) < 58){
				sum += (str.charAt(i) - 48) * (Math.pow(10,temp));
				++temp;
				lastValidInt = i;
			}
		}
		for (int i = 0; i < lastValidInt; ++i){
			if(str.charAt(i) == 45){
				return -sum;
			}
		}

		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(atoi(" -  sf2d3fe 65f"));

	}

}
