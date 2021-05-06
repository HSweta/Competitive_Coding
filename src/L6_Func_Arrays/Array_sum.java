package L6_Func_Arrays;

public class Array_sum {
	public static void main(String[] args) {

		int n = 4;
		int[] a1 = { 1, 0, 2, 9 };

		// for(int i=0;i<n;i++)
		// a1[i]=sc.nextInt();

		int m = 5;
		int[] a2 = { 3, 4, 5, 6, 7 };

		// for(int i=0;i<m;i++)
		// a2[i]=sc.nextInt();
		int s = Math.max(n, m) + 1;
		int h = s - 1;

		int[] str = sum(s, n, m, a1, a2);

		for (int i = 0; i < s; i++) {

			System.out.print(str[i] + ", ");

		}

		System.out.print("END ");

	}

	public static int[] sum(int j, int n, int m, int[] a1, int[] a2) {

		int[] str = new int[j];
		j = j - 1;
		n = n - 1;
		m = m - 1;
		int carry = 0;

		while (j >= 0) {
			int no = 0;
			if (m >= 0 && n >= 0) {
				no = carry + a2[m] + a1[n];
			}

			else if (n < 0 && m >= 0)
				no = carry + a2[m];
			else if (m < 0 && n >= 0)
				no = carry + a1[n];

			str[j] = no % 10;
			System.out.println(str[j] + " " + j);
			carry = no / 10;

			n--;
			m--;
			j--;

		}

		return str;
	}

}
