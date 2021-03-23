class ProvaArray {
	static void stampa(int[] x) {
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + "   ");
		System.out.println();
	}

	static int[] crea(int n) {
		int[] x = new int[n];
		for (int i = 0; i < x.length; i++)
			x[i] = SavitchIn.readLineInt();
		return x;
	}

	static boolean uguali(int[] x, int[] y) {
		if (x.length == y.length) {
			boolean b = true;
			for (int i = 0; i < x.length && b; i++)
				if (x[i] != y[i])
					b = false;
			return b;
		}
		return false;
	}

	static int[] aggiungi(int[] x, int n) {
		int[] y = new int[x.length + 1];
		for (int i = 0; i < x.length; i++)
			y[i] = x[i];
		y[x.length] = n;
		return y;
	}

	public static void main(String[] args) {
		int[] a = crea(5);
		System.out.println(a.length);
		/***
		 * int[] b = crea(5); System.out.println(a == b);
		 * System.out.println(uguali(a,b));
		 */
		a = aggiungi(a, 6);
		System.out.println(a.length);
		stampa(a);
	}
}