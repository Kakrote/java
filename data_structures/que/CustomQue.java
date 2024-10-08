package que;

/**
 * CustomQue
 */
public class CustomQue {
    private static final int DEFULT_SIZE=5;
    Object data[];
    int ptr=-1;

    CustomQue(){
        this(DEFULT_SIZE);
    }
    CustomQue(int size){
        this.data=new Object[size];

    }

    public void insert(int iteam) throws CustomQueException{
        if(isFull()){
            throw new CustomQueException("Que is full");
            // return false;
        }
        data[++ptr]=iteam;
        // return true;
    }
    public void remove() throws CustomQueException{
        if(isEmpty()){
            throw new CustomQueException("Can't remove from the empty list");
        }
        for(int i=0;i<ptr;i++){
            data[i]=data[i+1];
        }
        ptr--;

    }
    public void display(){
        System.out.print("[");
        for(int i=0;i<=ptr;i++){
            System.out.print(data[i]+",");
        }
        System.out.println("]");
    }


    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
}