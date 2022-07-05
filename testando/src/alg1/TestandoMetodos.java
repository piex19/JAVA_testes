package alg1;

public class TestandoMetodos {

	public int calcula(int a,int b){
	       return a+b;
	 }
	  public double calcula(double a,double b){
	        return a+b;
	   }
	  public String calcula(String a,String b){
	        return a+b;
	  }
	   public static void main(String args[]){
	     TestandoMetodos calc= new TestandoMetodos();
	     System.out.println(calc.calcula(1,1));
	    System.out.println(calc.calcula(2.0,6.1));
	    System.out.println(calc.calcula("vi","ram?"));
	  }
	}
	
	
