import java.util.*;
public class Vampire {
	static List<Integer> permutations(List<Integer> l) {
		if (l.size() == 1) {
			List<Integer> l3 = new ArrayList<Integer>();
			l3.add(l.get(0));
			return l3;
		}
		List<Integer> l1 = new ArrayList<Integer>();
		for (int i = 0; i < l.size(); i++) {
			int k = (l.get(i))*((int)Math.pow(10, l.size() - 1));
			List<Integer> l5 = new ArrayList<Integer>();
			l5.addAll(l.subList(0, i));
			l5.addAll(l.subList(i + 1, l.size()));
			List<Integer> l2 = permutations(l5);
			for (Integer m : l2){ l1.add(k + m);}
		}
		return l1;
	}
	static boolean hasZero(int i, int j) {
		return ((i - (i/10)*10) == 0) && ((j - (j/10)*10) ==0)? false: true;
	}
	static List<Integer> checkVampire(List<Integer> l6, int i, int siz) {
		List<Integer> l7 = new ArrayList<Integer>();
		for(Integer r : l6) {
			int la = r/((int)Math.pow(10, siz/2));
			r = r - la*((int)Math.pow(10, siz/2));
			if (!(l7.contains(la)) && hasZero(la, r) && la*r == i) {
				l7.add(la);
				l7.add(r);
			}	
		}
		return l7;
	}
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 1260) {
			System.out.println("there is no vampire number before the given number.");
		}else{
			for (int i = 1260; i <= n; i++) { 
				int vmp = i;
				int pmv = vmp;
				List<Integer> l4 = new ArrayList<Integer>();
				while(vmp != 0) {
					l4.add(vmp - (vmp/10)*10);
					vmp = vmp/10;
				}
				if(l4.size()%2 == 0) {
					List<Integer> ans = checkVampire(permutations(l4), pmv, l4.size());
					if(!(ans.isEmpty())) {System.out.println(pmv + ": " +ans);}
				}
			}
		}
	}
} 
			
			
