class QuickUnion extends UnionFind {
	public QuickUnion(int N) {
		super(N);
	}

	public void union(int p, int q) {
		int root_q = find(q);
		int root_p = find(p);
		
		set[root_q] = root_p;
	}

	public int find(int p) {
		while (p != set[p])
			p = set[p];
		return p;
	}
}
