public class CL_18_Finally_Block {
    public static void main(String[] args) {
        //Finally block is the block in which we give the code which we want to excicute in any condition 
        //whether the error is handel or not 
        int i=10;
        while(true){
            try{

                int j=20/i;
                i--;
            }
            catch(Exception e){
                System.out.println(e);
                break;//Genarlly the program should have come out from the loop after the value of i become 0 but 
                // becouse we have the finally block here so the program will go to the finally block once more when the 
                // exception occures.
            
            }
            finally{
                System.out.println("the program is endend");
            }
        }
        System.out.println("finally block is excuted and now we are out of the loop");
    }
}
