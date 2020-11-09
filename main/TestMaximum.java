
public class TestMaximum<first, second, third> {
	int firstInteger;
	int secondInteger;
	int thirdInteger;
	
	public TestMaximum(int firstInteger, int secondInteger, int thirdInteger) {
		this.firstInteger = firstInteger;
		this.secondInteger = secondInteger ;
		this.thirdInteger = thirdInteger;
	}
	
	public static <E extends Comparable<E>> int maximum(E first, E second, E third) {
		int maximum = (int) first;
		if(second.compareTo(first) > 0) {
			maximum = (int) second;
		}
		if(third.compareTo(second) > 0) {
			maximum = (int) third;
		}
		return maximum;
		
	}

}
