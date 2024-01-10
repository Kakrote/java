 class Employ{
    private int id;
    private String name;
    // these two variable are private and can't be use out side this class 
    // even if we made a object for it
    // so how to acess them lets see:-
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
 }// these 4 function will set and retun the values for private variables 
public class Getters_and_setters {
    public static void main(String[] args) {
        /* 
        now let suppose we have two variables which are private type
        then we cant acess them from outside the class
        to acess them out side the class we have to use function like setter and getter to set and update the value
        setter will update the value and getter will retun the value
        */ 
        Employ ep=new Employ();
        ep.setId(123);
        ep.setName("Anshul pundir");
        System.out.println(ep.getId()+"\n"+ep.getName());

    }
}
