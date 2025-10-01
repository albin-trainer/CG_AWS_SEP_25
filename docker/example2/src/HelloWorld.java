public class HelloWorld{
  public static void main(String[] args) throws Exception{
   System.out.println("Java running in Docker");

   for(int i=1;i<=1000;i++)
	Thread.sleep(10000);
 }
}