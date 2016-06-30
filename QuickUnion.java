class QuickUnion extends UnionFind {
	public QuickUnion(int N) {
		super(N);
	}

	public void union(int p, int q) {
		int root = q;
		while (mSet[root] != root) {
			root = mSet[root];
		}

		mSet[root] = p;
	}

	public boolean connected(int p, int q) {
		int root_p = mSet[p];
		while (mSet[root_p] != root_p) {
			root_p = mSet[root_p];
		}

		int root_q = mSet[q];
		while (mSet[root_q] != root_q) {
			root_q = mSet[root_q];
		}

		return root_q == root_p;
	}
}
