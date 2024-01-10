import java.util.Scanner;

public class gggg {
    int arr[]=new int[100];
    int c=1;
    void add(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<c;i++){
            arr[i]=sc.nextInt();
        }
        c++;
    }
    void display(){
        for(int e:this.arr){
            if(e==0){
                continue;
            }
            System.out.println(e);
        }
    }
    void delete(){
        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for(int i=0;i<arr.length;i++){
            if(this.arr[i]==num){
                this.arr[i]=0;
            }
        }
    }
    public static void main(String[] args) {
        gggg g=new gggg();
        g.add();
        g.add();
        g.display();
        g.delete();
        g.display();
    }
}