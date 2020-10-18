package 蓝桥杯2019;

public class 最小约数和 {
	public static int[] x = new int[100];

	public static void main(String[] args) {
		for (int i = 1; i < 20000; i++) {
			if (i % 10000 == 0) {
				System.out.println(i);
			}
			int n = f(i);
			if (x[n] == 0) {
				x[n] = i;
			}
		}
		int sum = 0;
		for (int i = 1; i <= 60; i++) {
			System.out.println("S[" + i + "] = " + x[i]);
			sum += x[i];
		}
		System.out.println(sum);
	}

	public static int f(int i1) {
		double a = i1;
		int n = 0;
		n++;
		if (i1 % 2 == 0) {
			for (int i = 2; i <= i1; i += 2) {
				if ((a / i) == (i1 / i)) {
					n++;
				}
				if (n > 60) {
					return 65;
				}
			}
		} else {
			for (int i = 3; i <= i1; i += 2) {
				if ((a / i) == (i1 / i)) {
					n++;
				}
				if (n > 60) {
					return 65;
				}
			}
		}
		return n;
	}
}
