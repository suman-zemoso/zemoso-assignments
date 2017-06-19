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
			l5 = permutations(l5);
			for (Integer m : l5){ l1.add(k + m);}
		}
		return l1;
	}
	static boolean hasZero(int i, int j) {
		return !(i%10 == 0 && j%10 ==0);
	}
	static List<Integer> checkVampire(List<Integer> l6, int i, int siz) {
		List<Integer> l7 = new ArrayList<Integer>();
		for(Integer r : l6) {
			int la = r/((int)Math.pow(10, siz/2));
			r = r%((int)Math.pow(10, siz/2));
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
			int x = 10000;
			for (int i = 1260; i <= n; i++) {
				if(i == x){
					i = x*10;
					x = x*100;
				}
				int vmp = i;
				int pmv = vmp;
				List<Integer> l4 = new ArrayList<Integer>();
				while(vmp != 0) {
					l4.add(vmp%10);
					vmp = vmp/10;
				}
				List<Integer> ans = checkVampire(permutations(l4), pmv, l4.size());
				if(!(ans.isEmpty())) {System.out.println(pmv + ": " +ans);}
			}
		}
	}
} 
			
			
