package finalExamExercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;

public class ReadTextFile {
	static String path = "C:\\Users\\frash\\eclipseQA22\\finalExam\\data\\Dictionary.txt";
	
	public static void main(String[] args) throws IOException {
	
	     doesFileExist(path);	
	}
	
	public static void doesFileExist(String path) throws IOException {
		
		File f = new File(path);
		FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line; 
        while((line = br.readLine())!=null) {
        String [] words = line.split("-|\\,");
        for(String word : words) {
        	if(word.isEmpty()) {
        		continue;
        	}	
        	System.out.println(word);
        }
        }
		
		 
	}

}
