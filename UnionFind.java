import java.lang.StringBuffer;

abstract class UnionFind {
	protected int[] mSet;

	public UnionFind (int N) {
		mSet = new int[N];
		for (int i = 0; i < N; i++) {
			mSet[i] = i;
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < mSet.length; i++)
			sb.append("[" + i + "]" + "\t");
		sb.append("\n");
		for (int x : mSet) {
			sb.append(x + "\t");
		}

		return sb.toString();
	}

	abstract public void union (int p, int q);
	abstract public boolean connected (int p, int q);
}
