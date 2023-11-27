import java.util.Set;
import java.util.TreeSet;

class MissingInteger {
	public int solution(int[] A) {
		Set<Integer> testedSet = new TreeSet<>();
		Set<Integer> perfectSet = new TreeSet<>();

		for(int i=0; i<A.length; i++) {
			testedSet.add(A[i]);
			perfectSet.add(i+1);
		}

		for(Integer current : perfectSet) {
			if(!testedSet.contains(current)) {
				return current;
			}
		}

		if(perfectSet.size() == testedSet.size()) {
			return perfectSet.size() + 1;  //e.g. {1, 2, 3} should return 4
		}

		return 1;
	}
}