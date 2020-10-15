package yaksha;

public class BubbleSort {
	private int sizeOfArray;
	private int array[];

	public BubbleSort(int sizeOfArray, int[] array) {
		super();
		this.sizeOfArray = sizeOfArray;
		this.array = array;
	}

	public int getSizeOfArray() {
		return sizeOfArray;
	}

	public void setSizeOfArray(int sizeOfArray) {
		this.sizeOfArray = sizeOfArray;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
}
