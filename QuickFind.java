class QuickFind extends UnionFind {
	public QuickFind(int N) {
		super(N);
	}

	public void union (int p, int q) {
		int root = mSet[q];

		for (int i = 0; i < mSet.length; i++)
			if (mSet[i] == root)
				mSet[i] = mSet[p];
	}

	public boolean connected (int p, int q) {
		return mSet[p] == mSet[q];
	}
}
