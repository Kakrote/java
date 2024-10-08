package stack;

public class DynamicStack extends CustomStack {

    DynamicStack(){
        super(); // this will call the constructer of the CustomStack empty
    }
    DynamicStack(int size){
        super(size);// this will call the parapertic custrutor of CustomStack
    }

    @Override
    public boolean push(int iteam){
        if(this.isFull()){
            // double the array size 
            int temp[]=new int[data.length*2];
            // coping all the elements of the data array into new array
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        // inserting the element using the push method of CustomStack class
        return super.push(iteam);
    }
    
}
