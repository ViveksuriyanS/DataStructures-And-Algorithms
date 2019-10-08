package Interview;

import java.util.HashMap;
import java.util.Map;

public class KeyPairLock {

	public static void main(String[] args) {
		int[] arr = new int[2];
		int[] nums = { 4, 5, 3, 2, 1, 6, 7 };
		int target = 12;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			Integer val = map.get(target - nums[i]);
			if (val == null) {
				map.put(nums[i], i);
				System.out.println(val);
				System.out.println(target);
				System.out.println(nums[i] + "    " + i);

			} else {
				arr[0] = val;
				arr[1] = i;
				break;
			}
			
		}

		System.out.println(arr[0] + "  " + arr[1]);
	}

}
