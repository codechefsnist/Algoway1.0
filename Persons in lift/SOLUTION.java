import java.util.*;

class PersonsInLift {
    public int maxNumberOfPersons(int[] arr) {
        Arrays.sort(arr);
        int i = 0, weight = 0; 
        for(i=0; i<arr.length && weight + arr[i] <= 500 ; i++) {
            weight += arr[i]; 
        }
        return i; 
    }
	public static void main( String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] persons=new int[N];
		for(int i=0;i<N;i++)
			persons[i]=sc.nextInt();
		System.out.println(new PersonsInLift().maxNumberOfPersons(persons));
	}
}