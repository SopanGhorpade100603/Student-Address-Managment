import java.util.ArrayList;
import java.util.Scanner;

class Contact{
    private String name;
    private String phone;

    public Contact(String name,String phone){
        this.name=name;
        this.phone=phone;
    }
    public String Getname(){
        return name;
    }
    public String Getphone(){
        return phone;
    }
}
public class SimpleAdressBook {
    private static ArrayList<Contact> ae=new ArrayList<>();
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);

      while(true){
          System.out.println("Address Book Management System");
          System.out.println("1. Add Contact");
          System.out.println("2. view Contact");
          System.out.println("3. Search Contact");
          System.out.println("4. Exist");

          System.out.println("Enter your Choice");
          int Choice =sc.nextInt();
          sc.nextLine();

          switch(Choice){
              case 1:
                      addContact(sc);
                      break;
              case 2:
                      viewContact(sc);
                      break;
              case 3:
                     searchContact(sc);
                     break;
              case 4:
                  System.out.println("Exiting AddressBook");
                  sc.close();
                  System.exit(0);
              default:
                  System.out.println("Invalid choice please try again");
          }
      }
    }
    private static void addContact(Scanner sc) {
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the phone number");
        String phone=sc.nextLine();

        Contact newContact = new Contact(name,phone);
       ae.add(newContact);
        System.out.println("Contact Added Successfully");
    }
    private static void viewContact(Scanner sc) {
        if(ae.isEmpty()){
            System.out.println("no Contact Found");
        }else{
            System.out.println("all Contact:");
            for(Contact contact:ae){
                System.out.println("Name: "+contact.Getname()+",phone: "+contact.Getphone());
            }
        }
    }
    private static void searchContact(Scanner sc) {
        System.out.println("Enter the name to Search");
        String Searchname =sc.nextLine();
        boolean found = false;
        for(Contact ae:ae){
        if(ae.Getname().equalsIgnoreCase(Searchname)){
            System.out.println("Contact found");
            System.out.println("Name "+ae.Getname() +",phone "+ae.Getphone());
            found =true;
            break;
        }
        }
        if(!found){
            System.out.println("Contact not found");
        }
    }
}
