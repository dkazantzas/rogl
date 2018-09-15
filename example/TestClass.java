public class TestClass {
	private int i;
	private String j;
	private double k;
	private char l;

	public TestClass() {
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getJ() {
		return j;
	}

	public void setJ(String j) {
		this.j = j;
	}

	public double getK() {
		return k;
	}

	public void setK(double k) {
		this.k = k;
	}

	public char getL() {
		return l;
	}

	public void setL(char l) {
		this.l = l;
	}

	@Override
	public String toString() {
		return "TestClass{" +
				"i=" + i +
				", j='" + j + '\'' +
				", k=" + k +
				", l=" + l +
				'}';
	}
}
