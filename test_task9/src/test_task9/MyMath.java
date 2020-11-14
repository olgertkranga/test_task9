package test_task9;

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd() {
		return a -> (a & 1) == 1;
	}

	public PerformOperation isPrime() {
		return a -> {
			if (a < 2) {
				return false;
			} else if (a == 2) {
				return true;
			} else if (a % 2 == 0) {
				return false;
			}
			int sqrt = (int) Math.sqrt(a);
			for (int i = 3; i <= sqrt; i += 2) {
				if (a % i == 0) {
					return false;
				}
			}
			return true;
		};
	}

	public PerformOperation isPalindrome() {
		return a -> {
			String polindromStr = Integer.toString(a);
			String polindromRevStr = new StringBuilder(Integer.toString(a)).reverse().toString();
			return polindromStr.equals(polindromRevStr);
		};
	}

}