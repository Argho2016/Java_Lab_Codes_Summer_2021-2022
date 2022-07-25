import java.io.*;

public class file {
  public static void main(String[] args) {
	  try {
    BufferedWriter bw = new BufferedWriter(
	new FileWriter("C:\\Users\\Teacher\\Desktop\\File\\output.txt"));
	bw.write("Jack\n");
	bw.write("Jill\n");
	bw.write("Hill");
	bw.close();
	  }
	  catch (Exception e){
		  return;
	  }
  }
}
