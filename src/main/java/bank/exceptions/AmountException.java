package bank.exceptions;

// extends is the keyword used to inherit from another class 
public class AmountException extends Exception {
  
  public AmountException(String message){
    super(message);
  }
}
