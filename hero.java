/**
 * hero
 */
public class hero {

    public static void main(String[] args) {
        int arr[]={

            1,2,3,41,14
        };
        int target=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
                break;
            }
            else {System.out.println(-1);
            break;
            }
        }

    }
}