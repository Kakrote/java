public class CL07_string_into {
    public static void main(String[] args) {
        String name=new String("Anshul pundir");
        System.out.println(name);
        // there are diffrent methods to print a string as onre of thenm is formate method e.g:-
        int a=10;
        float b=10.456f;
        System.out.printf("Anshul your roll number %d and your CGPA %f ",a,b); 
        // The stetment is print the formet given where %d= double and %f= float value
        // now if we use %.2f this will take value upto 2 after point
        System.out.println("see the diffrence in the values");
        System.out.printf("%.2f",b);
        // Now what if i write %5.2f this will take 5 values and upto 2 numbers after point
        System.out.println(" See the diffrence in the values");
        System.out.printf("%8.2f",b);
    }
}
 