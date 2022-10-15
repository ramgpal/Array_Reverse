
//To find Reverse of A given array
public class Main
{
    public static void Reverse_Array(int num[]) {
        int first=0,last=num.length-1;
       //loop
        while (first<last) {
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;
            first++;
            last--;
        }  
        
       
        }
	public static void main(String[] args) {
		int num[]={2,4,6,8};
		Reverse_Array(num);
		//to print array
		for(int i=0;i<num.length;i++) {
		System.out.print(num[i]+ " ");
	}
    System.out.println();
}
}