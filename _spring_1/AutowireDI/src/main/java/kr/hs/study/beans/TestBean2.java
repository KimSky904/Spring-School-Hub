package kr.hs.study.beans;

public class TestBean2 {
	private DataBean2 data4;
	private DataBean2 data5;
	
	public TestBean2() {
		System.out.println("TestBean2의 기본생성자");
	}
	public void Print() {
		System.out.println("data4 : "+data4);
		System.out.println("data5 : "+data5+"\n");
	}
	public DataBean2 getData4() {
		return data4;
	}
	public void setData4(DataBean2 data4) {
		this.data4 = data4;
	}
	public DataBean2 getData5() {
		return data5;
	}
	public void setData5(DataBean2 data5) {
		this.data5 = data5;
	}

}
