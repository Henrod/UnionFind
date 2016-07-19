class WeightedQuickUnion extends UnionFind {
	int[] size;

	public WeightedQuickUnion(int N) {
		super(N);
		size = new int[N];
		for (int i = 0; i < N; i++)
			size[i] = 1;
	}

	public void union(int p, int q) {
		int root_p = find(p);
		int root_q = find(q);

		if (size[root_p] > size[root_q]) {
			set[root_q] = root_p;
			size[root_p] += size[root_q];
		} else {
			set[root_p] = root_q;
			size[root_q] += size[root_p];
		}
	}

	public int find(int p) {
		while (p != set[p])
			p = set[p];
		return p;
	}
}