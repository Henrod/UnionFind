class Main {
	public static void main (String[] args) {
		int N = 7;

		System.out.println("\t\tQuick Find");
		UnionFind qf = new QuickFind(N);
		System.out.println(qf.toString());

		System.out.println("Union 0 and 1: ");
		qf.union(0, 1);
		System.out.println(qf.toString() + "\n");

		System.out.println("Union 2 and 3: ");
		qf.union(2, 3);
		System.out.println(qf.toString() + "\n");

		System.out.println("Union 0 and 2: ");
		qf.union(0, 2);
		System.out.println(qf.toString() + "\n");

		System.out.println("Union 1 and 5: ");
		qf.union(1, 5);
		System.out.println(qf.toString() + "\n");

		System.out.println("Union 3 and 6: ");
		qf.union(3, 6);
		System.out.println(qf.toString() + "\n");

		System.out.println("Is 1 connected to 2? " + (qf.find(1) == qf.find(2)));
		System.out.println("Is 0 connected to 6? " + (qf.find(0) == qf.find(6)));
		System.out.println("Is 3 connected to 4? " + (qf.find(3) == qf.find(4)) + "\n");

		System.out.println("\t\tQuick Union");
		UnionFind qu = new QuickUnion(N);
		System.out.println(qu.toString() + "\n");

		System.out.println("Union 0 and 1: ");
		qu.union(0, 1);
		System.out.println(qu.toString() + "\n");

		System.out.println("Union 2 and 3: ");
		qu.union(2, 3);
		System.out.println(qu.toString() + "\n");

		System.out.println("Union 0 and 2: ");
		qu.union(0, 2);
		System.out.println(qu.toString() + "\n");

		System.out.println("Union 1 and 5: ");
		qu.union(1, 5);
		System.out.println(qu.toString() + "\n");

		System.out.println("Union 3 and 6: ");
		qu.union(3, 6);
		System.out.println(qu.toString() + "\n");

		System.out.println("Is 1 connected to 2? " + (qu.find(1) == qu.find(2)));
		System.out.println("Is 0 connected to 6? " + (qu.find(0) == qu.find(6)));
		System.out.println("Is 3 connected to 4? " + (qu.find(3) == qu.find(4)) + "\n");

		System.out.println("\t\tWeighted Quick Union");
		UnionFind wqu = new WeightedQuickUnion(N);
		System.out.println(wqu.toString() + "\n");

		System.out.println("Union 0 and 1: ");
		wqu.union(0, 1);
		System.out.println(wqu.toString() + "\n");

		System.out.println("Union 2 and 3: ");
		wqu.union(2, 3);
		System.out.println(wqu.toString() + "\n");

		System.out.println("Union 0 and 2: ");
		wqu.union(0, 2);
		System.out.println(wqu.toString() + "\n");

		System.out.println("Union 1 and 5: ");
		wqu.union(1, 5);
		System.out.println(wqu.toString() + "\n");

		System.out.println("Union 3 and 6: ");
		wqu.union(3, 6);
		System.out.println(wqu.toString() + "\n");

		System.out.println("Is 1 connected to 2? " + (wqu.find(1) == wqu.find(2)));
		System.out.println("Is 0 connected to 6? " + (wqu.find(0) == wqu.find(6)));
		System.out.println("Is 3 connected to 4? " + (wqu.find(3) == wqu.find(4)) + "\n");

		System.out.println("\t\tUnion-by-Rank with Path-Compression");
		UnionFind urpc = new UnionByRankPathCompression(N);
		System.out.println(urpc.toString() + "\n");

		System.out.println("Union 0 and 1: ");
		urpc.union(0, 1);
		System.out.println(urpc.toString() + "\n");

		System.out.println("Union 2 and 3: ");
		urpc.union(2, 3);
		System.out.println(urpc.toString() + "\n");

		System.out.println("Union 0 and 2: ");
		urpc.union(0, 2);
		System.out.println(urpc.toString() + "\n");

		System.out.println("Union 1 and 5: ");
		urpc.union(1, 5);
		System.out.println(urpc.toString() + "\n");

		System.out.println("Union 3 and 6: ");
		urpc.union(3, 6);
		System.out.println(urpc.toString() + "\n");

		System.out.println("Is 1 connected to 2? " + (urpc.find(1) == urpc.find(2)));
		System.out.println(urpc.toString() + "\n");
		System.out.println("Is 0 connected to 6? " + (urpc.find(0) == urpc.find(6)));
		System.out.println(urpc.toString() + "\n");
		System.out.println("Is 3 connected to 4? " + (urpc.find(3) == urpc.find(4)));
		System.out.println(urpc.toString());
	}
}
