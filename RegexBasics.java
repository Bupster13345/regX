import java.util.*;
import java.io.*;
import java.util.regex.*;

public class RegexBasics {
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(System.in);
    System.out.print("hex: ");
    String hexFile = in.nextLine();
    System.out.print("phone: ");
    String phoneFile = in.nextLine();
    System.out.print("email: ");
    String mailFile = in.nextLine();
    Scanner fin1 = new Scanner(new File("hex" + hexFile + ".txt"));
    Scanner fin2 = new Scanner(new File("phone" + phoneFile + ".txt"));
    Scanner fin3 = new Scanner(new File("email" + mailFile + ".txt"));
    Pattern hexPat = Pattern.compile("^[0-9A-F]{6}$");
    Pattern phonePat = Pattern.compile("\\(?[0-9]{3}(\\) | |-)?[0-9]{3}-?[0-9]{4}");
    Pattern mailPat = Pattern.compile("^[a-z\\-_]+@[a-z\\-]+\\.[a-z]{2,4}$", Pattern.CASE_INSENSITIVE);
    ArrayList<String> hex = new ArrayList<String>();
    while(fin1.hasNextLine()){
      hex.add(fin1.nextLine());
    }
    ArrayList<String> phone = new ArrayList<String>();
    while(fin2.hasNextLine()){
      phone.add(fin2.nextLine());
    }
    ArrayList<String> mail = new ArrayList<String>();
    while(fin3.hasNextLine()){
      mail.add(fin3.nextLine());
    }
    boolean hexFound = false;
    for(int o = 0; o < hex.size(); o++){
      hexFound = hexPat.matcher(hex.get(o)).matches();
      if (hexFound){
        System.out.println(hex.get(o) + " is a valid index");
      }
      else {
        System.out.println(hex.get(o) + " is not a valid index");
      }
    }
    System.out.println("\\");
    
    boolean phoneFound = false;
    for(int o = 0; o < phone.size(); o++){
      phoneFound = phonePat.matcher(phone.get(o)).matches();
      if (phoneFound){
        System.out.println(phone.get(o) + " is a valid index");
      }
      else {
        System.out.println(phone.get(o) + " is not a valid index");
      }
    }
    System.out.println("\\");
    boolean mailFound = false;
    for(int o = 0; o < mail.size(); o++){
      mailFound = mailPat.matcher(mail.get(o)).matches();
      if (mailFound){
        System.out.println(mail.get(o) + " is a valid index");
      }
      else {
        System.out.println(mail.get(o) + " is not a valid index");
      }
    } 
  }
}