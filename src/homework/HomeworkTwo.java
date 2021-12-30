package homework;

public class HomeworkTwo {
	
	public static void main(String[] args) {
		
		char gender= 'M';
		
		switch (gender) {
		
		case 'M':
			System.out.println("Male");
			break;
		case 'm' :
			System.out.println("male");
			break;
		case 'F' :
			System.out.println("Female");
			break;
		case 'f' :
			System.out.println("female");
			break;
			default:
				System.out.println("others");
			
			break;
		}
		
	}

}
