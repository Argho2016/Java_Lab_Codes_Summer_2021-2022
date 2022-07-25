class exceptionH {
	
	public static void divideByZero() {

    throw new ArithmeticException("Trying to divide by 0");
  }
  
  public static void main(String[] args) {
    try {
      int divideByZero = 5 / 0;
    }

    catch (ArithmeticException e) {
      System.out.println("ArithmeticException => " + e.getMessage());
    }
    
    finally {
      System.out.println("The code is running properly");
    }
	//divideByZero();
  }
}
