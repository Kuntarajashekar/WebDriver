package webdriver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Links {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\LENOVO\\Documents\\name.txt"));

		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\LENOVO\\Documents\\example.txt"));

		String line;
		while((line=br.readLine())!=null)
			
		{
			System.out.println(line);
			bw.write(line);
		}
		br.close();
		bw.close();
			

	}

}
