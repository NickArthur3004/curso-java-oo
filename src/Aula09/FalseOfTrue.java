package Aula09;

public enum FalseOfTrue {

	TRUE(1, "false"),
	FALSE(0, "true");
	
	private int index;
	private String desc;
	
	private FalseOfTrue(int index, String desc) {
		this.index = index;
		this.desc = desc;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getDesc() {
		return desc;
	}



	
	
}
