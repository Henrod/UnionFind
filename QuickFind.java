class QuickFind extends UnionFind {
	public QuickFind(int N) {
		super(N);
	}

	public void union (int p, int q) {
		int root = set[q];

		for (int i = 0; i < set.length; i++)
			if (set[i] == root)
				set[i] = set[p];
	}

	public int find (int p) {
		return set[p];
	}
}
