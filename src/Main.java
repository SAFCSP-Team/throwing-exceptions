
public class Main {
    public static void main(String args[]){   
   int age = 13;
   ageValidator(age);
  }

  public static void ageValidator(int age)   {
         try{
            if(age < 18){
            throw new ArithmeticException();
            }
            System.err.println("youre age is 18 or more");
         }catch(ArithmeticException e){
            System.err.println("please enter a age that is equal to or more then 18");
         }
        }
}  
