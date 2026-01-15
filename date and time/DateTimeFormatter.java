import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
class A{
  public static void main(String args[]){
    LocalDateTime two=LocalDateTime.now();
    System.out.println(two);
    DateTimeFormatter three=DateTimeFormatter.ofPattern("yyyy MMM dd ,E HH:mm:ss");
    System.out.println(three.format(two));
  } 
} 
