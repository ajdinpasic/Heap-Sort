package heapsort;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		IPADRRESS [] ipArray=new IPADRRESS[10000]; 
		Scanner scanner = new Scanner(new File("ipadresee.csv"));
		int k=0;
		while(scanner.hasNextLine() && k<ipArray.length) {
			
			String value=scanner.nextLine();
			String newValue=value.replace("\"", "");
			String [] load=newValue.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
			ipArray[k]=new IPADRRESS(Long.parseLong(load[0]), Long.parseLong(load[1]), load[2], load[3], load[4], load[5]);
			load=null;
			k++;
			
		} scanner.close();
		
		long start=System.currentTimeMillis();
		HeapSort.sort(ipArray);
		
		FileWriter filewriter=new FileWriter(new File("solutions.txt"));
		for (IPADRRESS item: ipArray) {
		filewriter.write(item.toString()+"\n");
		}
		filewriter.close();
		System.out.println("Done! The results are in txt file");
		System.out.println("The time taken is: "+(System.currentTimeMillis()-start)+" ms");
		System.out.println("The number of sorted addresses: "+k);
		
	}

}

