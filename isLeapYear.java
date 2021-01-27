public class isLeapYear {
	public static void main(String[] args) {
		int year = 2020;
		if (year % 400 == 0) {
			System.out.println("它是闰年");
		}else if(year % 4 == 0 && year % 100 != 0) {
			System.out.println("它也是闰年");
		}else {
			System.out.println("它不是闰年");
		}
	}
}