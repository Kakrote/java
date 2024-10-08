package stack;

public class CustomStack {
   protected int[] data;
   public static final int DEFULT_SIZE = 10;
   int ptr=-1;

   public CustomStack() {
      this(10);
   }

   public CustomStack(int var1) {
      this.data = new int[var1];
   }

   public boolean push(int iteam){
      if(isFull()) {
         System.out.println("the stack is full");
         return false;
      }
      ptr++;
      data[ptr]=iteam;
      return true;
   }

   public int pop() throws CustomStackException{
      if(isEmpty()){
         throw new CustomStackException("the stack is empty");
      }
      int removed=data[ptr];
      ptr--;
      return removed;
   }

   public int peek() throws CustomStackException{
      if(isEmpty()){
         throw new CustomStackException("can't peek from an empty stack");
      }
      return data[ptr];
   }

   public boolean isFull(){
      return ptr==data.length-1;// ptr is at last index
   }
   public boolean isEmpty(){
      return ptr==-1;// ptr is at null;
   }

   public static void main(String[] args) {
      System.out.println("kelllo");
   }
}
