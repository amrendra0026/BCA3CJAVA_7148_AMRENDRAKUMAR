import java.io.*;

public class TestThrows {
	static void readFile()throws IOException {
		FileReader file = new FileReader("monu_notes.txt");
		BufferedReader br = new BufferedReader(file);
		System.out.println(br.readLine());
		
	}
	public static void main(String[] args) {
		try {
			readFile();
			
		} catch (IOException e){
			System.out.println("Caller handled File Error for monu: " + e.getMessage());
		}
	}
}