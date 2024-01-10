public class pratice3 {
    static public void sort(int arr[],int n){
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int e:arr)
        System.out.print(e+" ");
    }
    public static void main(String[] args) {
        int arr1[]={5,9,2,10,6};
        int arr2[]={15,8,11,1,3,4};
        int n=arr1.length+arr2.length;
        int g=arr1.length;
        int arr[]=new int[n];
        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            arr[g+j]=arr2[j];
            // g++;
        }
        System.out.println("Before sorting:-");
        for(int e:arr) System.out.print(e+" ");
        System.out.println("Array after merging:-");
        sort(arr, n);
        // for(int e:arr) System.out.print(e+" ");
    }   
}
