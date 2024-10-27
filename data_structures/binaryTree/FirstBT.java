package binaryTree;

import java.util.Scanner;

public class FirstBT  {
    public FirstBT(){

    }

    BT root;
    public void populate(Scanner scanner){
        System.out.println("Enter the root node value:- ");
        int value=scanner.nextInt();
        root=new BT(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner,BT node){
        System.out.println("Do you want to add the vlue to the left of : "+node.value);
        char left=scanner.next().charAt(0);
        if(left=='t'||left=='T'){
            System.out.println("Enter the value to the left of "+node.value);
            int value=scanner.nextInt();
            node.left=new BT(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to add the value to the right of: "+node.value);
        char right=scanner.next().charAt(0);
        if(right=='t'||right=='T'){
            System.out.println("Enter the vlaue to the right of: "+node.value);
            int value=scanner.nextInt();
            node.right=new BT(value);
            populate(scanner,node.right);
        }

    }

    public void display(){
        display(root,0);
    }

    private void display(BT node,int level){
        if(node==null){
            return;
        }
        display(node.right,level+1);   
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t");
            }

            System.out.println("|------>"+node.value);
        }
        else{
            System.out.println(node.value);
        }
        display(node.left, level+1);
    }
}
