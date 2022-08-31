package practice;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Armstrong numbers between 1 to 1000 are,");
		for (int i = 1; i <= 1000; i++) {
			int num = i;
			int dup = num;
			int a1 = num;
			int count = 0;

			while (dup > 0) {

				dup = dup / 10;
				count++;

			}
			int s=count;
			int result = 0;
			while (count > 0) {
				int a = num % 10;
				int res =(int) Math.pow(a, s);

				result = result + res;
				num = num / 10;
				count--;

			}
			if (a1 == result) {
				System.out.println(result);
			}
		}

	}

}
