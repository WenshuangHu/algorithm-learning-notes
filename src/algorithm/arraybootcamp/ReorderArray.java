package algorithm.arraybootcamp;

public class ReorderArray {
	
	public static void evenodd(int[] a) {
		int event = 0; int odd = a.length - 1;
		
		while(event < odd) {
//			if (a[event] % 2 == 0) {
//				event++;
//			}else {
				int tmp  = a[event];
				a[event] = a[odd];
				a[odd--] = tmp;
//			}
				event++;
		}
	}

	public static void main(String[] args) {
		int[] a = new int[]{1,1,3,4,5,6};
		reorder(a);
		System.out.println("tstssss");
		for(int i : a) {
			System.out.println(i);
		}
	}

	private static void reorder(int[] input) {
		int low = 0;
		int high = input.length - 1;
		while (low < high) {
			int tmp = input[high];
			input[high] = input[low];
			input[low] = tmp;
			low++;
			high--;
		}
	}

}
