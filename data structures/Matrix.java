import java.util.Scanner;

public class Matrix {
    int row,col;
    int matrix_01[][],matrix_02[][];
    int matrix[][];
    public void null_matrix(){
        final int matrix_0[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix_0[i][j]=0;
            }
        }
        matrix= matrix_0;
    }
    public void create(){
        int r,c;
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        r=s1.nextInt();
        System.out.print("Enter the number of coloms:- ");
        c=s1.nextInt();
        int matrix_1[][]=new int[r][c];
        int matrix_2[][]=new int[r][c];
        row=r;
        col=c;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("[%d][%d]:- ",i,j);
                matrix_1[i][j]=s1.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix_1[i][j]+" ");
            }
            System.out.println(" ");
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.printf("[%d][%d]:- ",i,j);
                matrix_2[i][j]=s1.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix_2[i][j]+" ");
            }
            System.out.println(" ");
        }
        matrix_01=matrix_1;
        matrix_02=matrix_2;
    }
    public void add(){
        create();
        null_matrix();
        System.out.println("The Addition of two matrixs is:- ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=matrix_01[i][j]+matrix_02[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public void sub(){
        create();
        null_matrix();
        System.out.println("The subtraction of two matrixs is:- ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=matrix_01[i][j]-matrix_02[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }
    public void traspose(){
        Scanner s2=new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        row=s2.nextInt();
        System.out.print("Enter the number of col:- ");
        col=s2.nextInt();
        int matrix_01[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.format("[%d][%d]:- ",i,j);
                matrix_01[i][j]=s2.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix_01[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("The traspose of the first matrix is:- ");
        int tras_matrix[][]=new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                tras_matrix[i][j]=matrix_01[j][i];
            }
        }
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(tras_matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Matrix m=new Matrix();
        while(true){
            System.out.println("---***Enter your choies***---");
            System.out.println("1-Addition of matrixs\n2-Subtration of matrixs\n3-Traspose of matrixs\n4-Multiplying of two matrix\n5-Spose matrix\n6-exit");
            int op=sc.nextInt();
            switch(op){
                case 1-> m.add();
                case 2-> m.sub();
                case 3-> m.traspose();
                case 6-> System.exit(0);
            }
        }
    }   
}
