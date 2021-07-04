package Nagaroo_Question;

import java.util.LinkedList;
import java.util.Queue;

public class QueueQuestion {

	private static class PP {
		int pno;
		int arrival;
		int burst;
		int end;
		int timeRemaing;

		public PP(int pno, int arrival, int burst) {
			this.pno = pno;
			this.arrival = arrival;
			this.burst = burst;
			this.timeRemaing = burst;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return " P " + pno + " BT " + burst + " AT " + arrival + " ET " + end;
		}
	}

	public static void main(String[] args) {

		int process = 4;
		int timeSlice = 2;

		int[] arrival = { 0, 1, 2, 3 };
		int[] burst = { 9, 5, 3, 4 };

		PP[] arr = new PP[process];

		for (int i = 0; i < arr.length; i++) {
			PP np = new PP(i, arrival[i], burst[i]);
			arr[i] = np;
		}

		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			q.add(i);
		}

		int timeElapsed = 0;

		while (!q.isEmpty()) {

			int rp = q.remove();

			PP pair = arr[rp];

			if (pair.timeRemaing <= timeSlice) {
				timeElapsed += pair.timeRemaing;
				pair.timeRemaing = 0;
				pair.end = timeElapsed;

			} else {
				pair.timeRemaing -= timeSlice;
				timeElapsed += timeSlice;
				q.add(rp);

			}
		}

		int[] tat = new int[process];
		double tatavg = 0;
		// TurnAroundTime
		for (int i = 0; i < arr.length; i++) {
			tat[i] = arr[i].end - arr[i].arrival;
			System.out.print(tat[i] + " ");
			tatavg += tat[i];
		}
		System.out.println();
		int[] wt = new int[process];
		double wtsum = 0;
		for (int i = 0; i < arr.length; i++) {
			wt[i] = tat[i] - arr[i].burst;
			System.out.print(wt[i] + " ");
			wtsum += tat[i];
		}
		System.out.println();

		System.out.println(String.format("%.6f", tatavg / process));
		System.out.println(String.format("%.6f", wtsum / process));

	}

}
