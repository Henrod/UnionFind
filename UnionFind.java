import java.lang.StringBuffer;

abstract class UnionFind {
	protected int[] set;

	public UnionFind (int N) {
		set = new int[N];
		for (int i = 0; i < N; i++) {
			set[i] = i;
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < set.length; i++)
			sb.append("[" + i + "]" + "\t");
		sb.append("\n");
		for (int x : set) {
			sb.append(x + "\t");
		}

		return sb.toString();
	}

	abstract public void union (int p, int q);
	abstract public int find (int p);
}
