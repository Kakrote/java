package que;

public class CustomCerculerQue {
    protected int data[];
    protected static final int DEFULT_SIZE=5;
    protected int end=0;
    protected int front=0;
    int size=0;

    CustomCerculerQue(int size){
        this.data=new int[size];
    }
    CustomCerculerQue(){
        this(DEFULT_SIZE);
    }

    public boolean isFull(){
        return size==data.length-1;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public boolean insert(int iteam){
        if(isFull()){
            System.out.println("the Que is full !");
            return false;
        }
        data[end++]=iteam;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove()throws CustomQueException{
        if(isEmpty()){
            throw new CustomQueException("can't remove from the empty Que");

        }
        int remove=data[front++];
        front=front%data.length;
        size--;
        return remove;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("The Que is empty");
            return;
        }
        int i=front;
        do{
            System.out.print(data[i]+"<-");
            i++;
            i%=data.length;
        }
        while(i!=end);
        System.out.println("end");

    }
}
