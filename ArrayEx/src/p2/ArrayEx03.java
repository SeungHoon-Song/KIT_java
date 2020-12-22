package p2;

public class ArrayEx03 {

	public static void main(String[] args) {
		//배열복사
		int[] oldIntArray = {1,2,3,4,5,6};
		int[] oldIntArray1 = {4,5,7,8};
		int[] newIntArray = new int[10];
		//복사전
		System.out.println("복사전");
		for(int i=0;i<newIntArray.length;i++) {
			System.out.print(newIntArray[i]+" ");
		}
		System.out.println();
		//복사1
		for(int i=0;i<oldIntArray.length;i++) {
			newIntArray[i]=oldIntArray[i];
		}
		//복사2
		int j=0;
		for(int i=oldIntArray.length;i<newIntArray.length;i++) {
			newIntArray[i]=oldIntArray1[j];
			j++;
		}
		//복사후
		System.out.println("복사후");
		for(int i=0;i<newIntArray.length;i++) {
			System.out.print(newIntArray[i]+" ");
		}
		System.out.println();
	
		
		
		int[] oA = {10,20};
		int[] nA = new int[5];
		
		System.arraycopy(oA, 0, nA, 0, oA.length);
		for(int a:nA) {
		System.out.print(a+" ");
		}
		System.out.println();
		
		
		
		double[] doubleArray2 = {5.2,8.3,4.2};
		double[] intArray2 = {100,200};
		double[] merageArray = new double[5];
		
		System.arraycopy(intArray2, 0, merageArray, 0, intArray2.length);
		System.arraycopy(doubleArray2, 2, merageArray, intArray2.length,1);
		System.arraycopy(doubleArray2, 1, merageArray, intArray2.length+1,1);
		System.arraycopy(doubleArray2, 0, merageArray, intArray2.length+2,1);
		for(int i=0;i<merageArray.length;i++) {
			System.out.print(merageArray[i]+" ");
		}
		System.out.println();
		
	}
}
