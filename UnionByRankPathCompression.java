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
			set[root_q] = root_p;
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

		while (p != set[p]) {
			int next = set[p];
			set[p] = root_p;
			p = next;
		}

		return root_p;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < set.length; i++)
			sb.append("[" + i + "]" + "\t");
		sb.append("\n");
		for (int i = 0; i < set.length; i++) {
			sb.append(set[i] + "(" + rank[i] + ")" + "\t");
		}

		return sb.toString();
	}
}