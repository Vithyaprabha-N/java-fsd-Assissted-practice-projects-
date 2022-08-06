
public class Binarysearch {
public static void main(String[]args) {
	int[]arr= {3,6,9,12,15};
	int key=12;
	int arrlength=arr.length;
	Binarysearch(arr,0,key,arrlength);
	}
public static void Binarysearch(int[]arr,int start,int key,int length) {
	int midvalue=(start+length)/2;
	while(start<=length) {
		if(arr[midvalue]<key) {
			start=midvalue+1;
		}
		else if(arr[midvalue]==key) {
			System.out.println("Element is found at index:"+midvalue);
			break;
		}
		else {
			length=midvalue-1;
		}
		midvalue=(start+length)/2;
	}
	if(start>length) {
		System.out.println("Element is not found");
	}
}
}
