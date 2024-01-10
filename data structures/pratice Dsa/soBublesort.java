public class soBublesort {
    public static void main(String[] args) {
        int temp;
        int arr[]={30,100,20,5,1};
        int l=arr.length;
        for(int i=0;i<l;i++){
            for(int j=0;j<l-1;j++){
                if(arr[j+1]>arr[j]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int e:arr){
            System.out.println(e);
        }
    }
}
