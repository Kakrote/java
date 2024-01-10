class MyEmploy{
    private int id;
    private String name;
    public MyEmploy(){// this a coustruter
        id=100;
        name="Anshul";
    }
    public void setId(int n){
        this.id=n;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){this.name=n;}
    public String getName(){return name;}
    
}
public class Constructors_java {
    public static void main(String[] args) {
        MyEmploy me=new MyEmploy();
        //me.setId(10);
        //me.setName("Anshul pundir");
        System.out.println("id= "+me.getId()+"\n"+me.getName());
    }
}
