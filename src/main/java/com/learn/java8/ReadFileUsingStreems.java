package com.learn.java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFileUsingStreems {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("Treaditional Way of doing");
		
		File myObj = new File("C:/Users/haris/Downloads/java8/pom.xml");
	    if (myObj.exists()) {
	      System.out.println("File name: " + myObj.getName());
	      System.out.println("Absolute path: " + myObj.getAbsolutePath());
	      System.out.println("Writeable: " + myObj.canWrite());
	      System.out.println("Readable " + myObj.canRead());
	      System.out.println("File size in bytes " + myObj.length());
	    } else {
	      System.out.println("The file does not exist.");
	    }
	    
	    
	    final String file = "C:/Users/haris/Downloads/java8/pom.xml";
        String inLIne = null;
        List<String> fileContents = new ArrayList<>();

        try {
            FileReader fReader = new FileReader(file);
            BufferedReader fileBuff = new BufferedReader(fReader);
            while ((inLIne = fileBuff.readLine()) != null) {
                fileContents.add(inLIne);
            }
            fileBuff.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(fileContents.contains("name"));


		List<String> stringList = Files.lines(Paths.get("C:/Users/haris/Downloads/java8/pom.xml"))
			.filter(line -> line.contains("name"))
			.map(line -> line.trim().replaceAll("name", "")
					.replaceAll("<", "")
					.replaceAll(">", "")
					.replaceAll("/", ""))
			.collect(Collectors.toList());
		
		
		System.out.println("list of strings----------" + stringList);
		
		

	}

}
