package binaryTree;

import java.util.Scanner;

public class BTmain extends FirstBT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BTmain tree=new BTmain();
        tree.populate(sc);
        tree.display();
    }
}
