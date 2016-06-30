class Main {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);

		System.out.println("\t\tQuick Find");
		QuickFind qf = new QuickFind(N);
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

		System.out.println("Is 1 connected to 2? " + qf.connected(1, 2));
		System.out.println("Is 3 connected to 4? " + qf.connected(3, 4) + "\n");

		System.out.println("\t\tQuick Union");
		QuickUnion qu = new QuickUnion(N);
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

		System.out.println("Is 1 connected to 2? " + qu.connected(1, 2));
		System.out.println("Is 3 connected to 4? " + qu.connected(3, 4) + "\n");
	}
}
