package OperationPostAndPre;

public class AppendStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		// System.out.println(sb.append(null).length());// since the append method can
		// either take String or StringBuilder,
		// It is unclear for compiler as to what that is so it leads to
		// CE.
		sb.append("0123456789");
		sb.delete(1, 1000);
		System.out.println(sb);
		
		int[][] a = new int[2][];
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[0][0]);
		
	}
}
