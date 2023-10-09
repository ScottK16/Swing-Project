package package1;

public class Student {

	private String name;
    private String address;
   

    public Student()
    {
        this.name = ""; 
        this.address = "";
        
    }

    public Student(String name, String address)
    {
        this.name = name;
        this.address = address;
       
    }

    public String getName()
    {
        return this.name;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void setName(String sName)
    {
        this.name = sName;
    }

    public void setAddress(String sAddress)
    {
        this.address = sAddress;
    }

   
    
    

    public String toString()
    {
        return 
         this.name + " " +
        " " +  this.address + "\n" ; 
       
       
       
    }
}
