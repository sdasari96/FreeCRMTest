package seleniumwd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class NotePad_Read {

	public static void main(String[] args) throws Exception{

		FileReader f=new FileReader("D:\\Sneha\\Selenium\\Sample.txt");
		BufferedReader br=new BufferedReader(f);
		System.out.println(br.readLine());
		String s;
		while((s=br.readLine())!=null)
		{
			String[] a=s.split(" ");
			System.out.println("Sentence-->"+s);
			for(int i=0;i<a.length;i++)
			{
				System.out.println("----------------> "+a[i]);
			}
		}
		br.close();
		
		FileWriter fw=new FileWriter("D:\\Sneha\\Selenium\\SampleWrite.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Its good writing here..!!!!");
		bw.close();
		

	}

}
