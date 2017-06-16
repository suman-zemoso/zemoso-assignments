import java.util.*;

public class VampireNumber {
	public static int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
        		fact *= i;
        	}
        	return fact;
	}
	static String factorsProduct(List<Integer> lis, int l) {
		int i = lis.size();
		int r = lis.size();
		int k = 0;
		for (int j = 0; j < r/2; j++) {
			k = k*10;
			k = k + lis.get(l/factorial(--i));
			lis.remove(l/factorial(i));
			if (l > factorial(i)){ 
				int lm = l/factorial(i);
				l = l - lm*factorial(i);
			}
		}
		int n = 0;
		for (int j = 0; j < r/2; j++) {
			n = n*10;
			n = n + lis.get(l/factorial(--i));
			lis.remove(l/factorial(i));
			//l = l/((l/factorial(i))!=0?(l/factorial(i)):1);
			if (l >= factorial(i)){ 
				int lm = l/factorial(i);
				l = l - lm*factorial(i);
			}
		}
		return k + "" + n;
			
	}
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int vmp = sc.nextInt();
		List<Integer> ls = new ArrayList<Integer>();
		List<Integer> ls1 = new ArrayList<Integer>();
		while (vmp != 0) {
			ls.add(vmp - (vmp/10)*10);
			vmp /= 10;
		}
		System.out.println(ls);
		/*for (int j = 0; j < factorial(ls.size()); j++) {
			for(Integer lmn : ls) { ls1.add(lmn);}
			System.out.println(factorsProduct(ls1, j));
		}*/
		System.out.println(factorsProduct(ls, 2));
	}
}
