import java.io.*;

public class file {
  public static void main(String[] args) {
	  try {
    BufferedReader bw = new BufferedReader(
	new FileReader("C:\\Users\\Teacher\\Desktop\\File\\output.txt"));
	String s;
	while((s = bw.readLine()) != null){
		System.out.println(s);
	}
	bw.close();
	  }
	  catch (Exception e){
		  return;
	  }
  }
}
