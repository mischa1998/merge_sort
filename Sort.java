class Sort{


	public static int[] sortarr(int[] a1, int[] a2) {
		System.out.println(a1.length + " " + a2.length);
		int[] res = new int [a1.length + a2.length];
		int i = 0, j = 0, count = 0;
		while (i < a1.length && j < a2.length) {
			if (a1[i] < a2[j]) {
				res[count] = a1[i];
				count++;
				i++;
			} else {
				res[count] = a2[j];
				count++;
				j++;
			}
		}
		if (i == a1.length && j == a2.length) {
			return res;
		} else if (i == a1.length) {
			for (int k = j; k < a2.length; k++) {
				res[count] = a2[k];
				count++;
			}
		} else if (j == a2.length) {
			for (int k = i; k < a1.length; k++) {
				res[count] = a1[k];
				count++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] a1 = {0, 2, 2, 10,10,20};
		int[] a2 = {1, 3, 5, 7, 8,10,10};
		int[] res = sortarr(a1, a2);
		System.out.println(res.length);//количество элементов в массиве
		for(int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.print("\n");
	}
}
