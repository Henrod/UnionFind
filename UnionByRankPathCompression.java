class UnionByRankPathCompression extends UnionFind {
	private int[] rank;

	public UnionByRankPathCompression(int N) {
		super(N);
		rank = new int[N];
	}

	public void union(int p, int q) {
		int root_p = find(p);
		int root_q = find(q);

		if (rank[root_p] > rank[root_q]) {
			set[root_q] = root_q;
		} else {
			set[root_p] = root_q;

			if (rank[root_p] == rank[root_q]) {
				rank[root_q]++;
			}
		}
	}

	public int find(int p) {
		int root_p = p;
		while(root_p != set[root_p]) {
			root_p = set[root_p];
		}
		set[p] = root_p;
		return root_p;
	}
}