
public class TestMaximum<first, second, third> {

	
	public static <E extends Comparable<E>> E maximum(E first, E second, E third) {
		E maximum = first;
		if(second.compareTo(first) > 0) {
			maximum = second;
		}
		if(third.compareTo(second) > 0) {
			maximum = third;
		}
		return maximum;
		
	}
	public static <E extends Comparable<E>> E multipleInput(E ...values) {
		E maximum = values[0];
	    for (E element : values) {
	        if (element.compareTo(maximum) > 0) {
	            maximum = element;
	        }
	    }
	    return maximum;
		
	}



}
