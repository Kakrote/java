// import java.util.Arrays;
public class Array_strng{
    public static void main(String[] args) {
        int a[]={10,2,3,5,2,3,2};
        int na[]=new int[a.length];
        na=a;
        int temp=0,count=0,dp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    temp=a[i];
                    count++;
                    break;
                }

            }
         }
         System.out.println(temp+":- "+(count-1));
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[j]                    ;
                    a[j]=a[i];
                    a[i]=temp;
                }

            }
         }
         // for(int i=0;i<a.length;i++){
             //     if(a[i]==)
             //}
             //  System.out.println(dp);
             for(int i=0;i<a.length;i++){
                 if(a[i]==a[i+1]){
                     temp=a[a.length-1];
                     a[a.length-1]=a[i+1];
                     a[i+1]=temp;
                     break;
                    }
                }
                int l=a.length;
                l-=1;
                // for(int i=0;i<l;i++){
                    //     System.out.println(a[i]);
                    // }
                    
                    for(int i=0;i<l;i++){
                        for(int j=0;j<a.length;j++){
                            if(a[i]<a[j]){
                                temp=a[j];
                                a[j]=a[i];
                                a[i]=temp;
                            }
            
                        }
                     }
                     
                     for(int i=0;i<l;i++)
                     System.out.println(a[i]);
                }
            }