package kr.hs.study.beans;

public class DataBean3 {
	int data1;
	int data2;
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public int getData2() {
		return data2;
	}
	public void setData2(int data2) {
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return data1+", "+data2;
	}
}
