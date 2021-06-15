package L63_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph {

	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Graph(int V) {

		for (int i = 1; i <= V; i++) {
			map.put(i, new HashMap<>());
		}

	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public boolean containsEdge(int v1, int v2) {

		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
	}

	public int numEdges() {

		int ans = 0;

		for (int key : map.keySet()) {
			ans += map.get(key).size();
		}

		return ans / 2;
	}

	public void removeEdge(int v1, int v2) {

		map.get(v1).remove(v2);
		map.get(v2).remove(v1);

	}

	public void display() {

		System.out.println("-------------");

		for (int i = 1; i <= map.size(); i++) {
			System.out.println(i + " -> " + map.get(i));
		}

		System.out.println("-------------");

	}

	public boolean hasPath(int src, int dst, Set<Integer> visited) {

		// as soon as you visit a node , marks it as visited
		visited.add(src);

		// check if you have reached the dst
		if (src == dst) {
			return true;
		}

		// check if path exists from nbrs
		for (int nbr : map.get(src).keySet()) {

			// ask for path only from unvisited nbrs
			if (!visited.contains(nbr)) {

				boolean res = hasPath(nbr, dst, visited);

				if (res)
					return true;
			}

		}

		// no path exist even in nbr
		return false;

	}

	public void PrintAllPath(int src, int dst, Set<Integer> visited, String ans) {

		if (visited.isEmpty()) {
			visited.add(src);
		}

		if (src == dst) {
			System.out.println(ans);
		}

		for (int nbr : map.get(src).keySet()) {
			if (!visited.contains(nbr)) {
				visited.add(nbr);
				PrintAllPath(nbr, dst, visited, ans + nbr);
				visited.remove(nbr);
			}

		}

	}

	public void printAllPath(int src, int dst, Set<Integer> visited, String ans) {

		visited.add(src);

		if (src == dst) {
			System.out.println(ans);
			visited.remove(src);
			return;
		}

		for (int nbr : map.get(src).keySet()) {

			if (!visited.contains(nbr)) {

				PrintAllPath(nbr, dst, visited, ans + nbr);

			}

		}

	}

	public boolean BFS(int src, int dst) {

		Set<Integer> visited = new HashSet<>();

		Queue<Integer> q = new LinkedList<>();
		q.add(src);

		while (!q.isEmpty()) {

			// q remove
			int rn = q.remove();

			//
			if (visited.contains(rn))
				continue;

			visited.add(rn);

			if (rn == dst)
				return true;

			for (int nbr : map.get(rn).keySet()) {
				if (!visited.contains(nbr)) {
					q.add(nbr);
				}
			}
		}

		return false;

	}

	public boolean DFS(int src, int dst) {

		Set<Integer> visited = new HashSet<>();

		Stack<Integer> s = new Stack<>();
		s.add(src);

		while (!s.isEmpty()) {

			// q remove
			int rn = s.pop();

			//
			if (visited.contains(rn))
				continue;

			visited.add(rn);

			if (rn == dst)
				return true;

			for (int nbr : map.get(rn).keySet()) {
				if (!visited.contains(nbr)) {
					s.add(nbr);
				}
			}
		}

		return false;

	}

	public void BFT() {

		Set<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();

		for (int src = 1; src <= map.size(); src++) {

			if (visited.contains(src))
				continue;

			q.add(src);

			while (!q.isEmpty()) {

				// q remove
				int rn = q.remove();

				//
				if (visited.contains(rn))
					continue;

				visited.add(rn);

				System.out.print(rn);

				for (int nbr : map.get(rn).keySet()) {
					if (!visited.contains(nbr)) {
						q.add(nbr);
					}
				}
			}
		}
		System.out.println();

	}

	public void DFT() {

		Set<Integer> visited = new HashSet<>();
		Stack<Integer> s = new Stack<>();

		for (int src = 1; src <= map.size(); src++) {

			if (visited.contains(src))
				continue;

			s.add(src);

			while (!s.isEmpty()) {

				// q remove
				int rn = s.pop();

				//
				if (visited.contains(rn))
					continue;

				visited.add(rn);

				System.out.print(rn);

				for (int nbr : map.get(rn).keySet()) {
					if (!visited.contains(nbr)) {
						s.add(nbr);
					}
				}
			}
		}

		System.out.println();

	}

	public boolean isCyclic() {

		Set<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();

		for (int src = 1; src <= map.size(); src++) {

			if (visited.contains(src))
				continue;

			q.add(src);

			while (!q.isEmpty()) {

				// q remove
				int rn = q.remove();

				//
				if (visited.contains(rn))
					return true;

				visited.add(rn);

				// System.out.print(rn);

				for (int nbr : map.get(rn).keySet()) {
					if (!visited.contains(nbr)) {
						q.add(nbr);
					}
				}
			}
		}

		return false;

	}

	public boolean isConnected() {

		int comp = 0;
		Set<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();

		for (int src = 1; src <= map.size(); src++) {

			if (visited.contains(src))
				continue;

			comp++;

			q.add(src);

			while (!q.isEmpty()) {

				// q remove
				int rn = q.remove();

				//
				if (visited.contains(rn))
					continue;

				visited.add(rn);

				for (int nbr : map.get(rn).keySet()) {
					if (!visited.contains(nbr)) {
						q.add(nbr);
					}
				}
			}

		}

		return comp == 1;

	}

	public boolean isTree() {

		return (!isCyclic() && isConnected());

	}

	public ArrayList<ArrayList<Integer>> getCC() {

		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

		Set<Integer> visited = new HashSet<>();
		Queue<Integer> q = new LinkedList<>();

		for (int src = 1; src <= map.size(); src++) {

			if (visited.contains(src))
				continue;

			ArrayList<Integer> comp = new ArrayList<>();

			q.add(src);

			while (!q.isEmpty()) {

				// q remove
				int rn = q.remove();

				//
				if (visited.contains(rn))
					continue;

				visited.add(rn);

				comp.add(rn);

				for (int nbr : map.get(rn).keySet()) {
					if (!visited.contains(nbr)) {
						q.add(nbr);
					}
				}

			}

			ans.add(comp);
		}
		return ans;
	}

	private class Pair {
		int node;
		char color;

		public Pair(int node, char color) {
			this.node = node;
			this.color = color;
		}
	}

	public boolean biPartite() {

		HashMap<Integer, Character> visited = new HashMap<>();
		Queue<Pair> q = new LinkedList<>();

		for (int src = 1; src <= map.size(); src++) {

			if (visited.containsKey(src))
				continue;

			Pair sp = new Pair(src, 'R');
			q.add(sp);

			while (!q.isEmpty()) {

				// q remove
				Pair rp = q.remove();

				//
				if (visited.containsKey(rp.node)) {
					char oc = visited.get(rp.node);
					char nc = rp.color;
				    
					if(oc!=nc) 
						return false;
					
					continue;
				}
					

				visited.put(rp.node, rp.color);

		

				for (int nbr : map.get(rp.node).keySet()) {
					if (!visited.containsKey(nbr)) {
						
						char nbrColor = (rp.color=='R'  
						q.add(nbr);
					}
				}
			}
		}
		System.out.println();

	}

}
