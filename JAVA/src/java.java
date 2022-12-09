import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class College{
    int id;
    String name;
    int contactNo;
    String address;
    int pincode;
    
    public College(int id,
    String name,
    int contactNo,
    String address,
    int pincode){
        this.id=id;
        this.name=name;
        this.contactNo=contactNo;
        this.address=address;
        this.pincode=pincode;
    }
public int  getpincode(){
   return pincode;
}   
public void setpincode(int pincode){
   this.pincode=pincode;
} 
public String getaddress(){
   return address;
}
public void setaddress(String address){
   this.address=address;
}
public int getid(){
   return id;
}
public void setid(int id){
   this.id=id;
}
public String getname(){
   return name;
}
public void setname(String name){
   this.name=name;
}
public int getcontactNo(){
   return contactNo;
}
public void setcontactNo(int contactNo){
   this.contactNo=contactNo;
}
}

public class java{
    public static void main(String args[] ) throws Exception {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
College[] c= new College[n];
for(int i=0;i<n;i++){
    int id=sc.nextInt();
    sc.nextLine();
    String name=sc.nextLine();
    int contactNo=sc.nextInt();
    sc.nextLine();
    String address=sc.nextLine();
    int pincode=sc.nextInt();
    c[i]=new College(id, name, contactNo, address, pincode);
}
sc.nextLine();
String address=sc.nextLine();
College f1= findCollegeWithMaximumPincode(c);
College f2= searchCollegeByAddress(c,address);
if(f1!=null){
    System.out.println("id"+f1.getid());
    System.out.println("name"+f1.getname());
    System.out.println("contactNo"+f1.getcontactNo());
    System.out.println("address"+f1.getaddress());
    System.out.println("pincode"+f1.getpincode());

}
else
{
    System.out.println("No College found with mentioned attribute.");
}

    if (f2!=null){
        System.out.println("id"+f2.getid());
    System.out.println("name"+f2.getname());
    System.out.println("contactNo"+f2.getcontactNo());
    System.out.println("address"+f2.getaddress());
    System.out.println("pincode"+f2.getpincode());
    }
    else{
         System.out.println("No College found with mentioned attribute.");
    }
}
public static College findCollegeWithMaximumPincode(College[] c){
    College m= null;
    int pin=0;
    for(int i=0;i<c.length;i++){
        if(c[i].getpincode()>pin){
            pin=c[i].getpincode();
            m=c[i];
        }
    }
    return m;
}
public static College searchCollegeByAddress(College[]c,String address){
    College m=null;
        for(int i=0;i<c.length;i++){
        if(c[i].getaddress().equalsIgnoreCase(address)){
            m=c[i];   
        }
    }
    return m;
}
}