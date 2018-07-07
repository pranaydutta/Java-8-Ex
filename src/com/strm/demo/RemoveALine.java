package com.strm.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class RemoveALine {
	 public static void main(String args[]){
	        try {
	            File inputFile = new File("D:\\tutorial\\wiki\\wiki.txt");
	            if (!inputFile.isFile()) {
	                System.out.println("Parameter is not an existing file");
	                return;
	            }
	            //Construct the new file that will later be renamed to the original filename.
	            File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");
	            BufferedReader br = new BufferedReader(new FileReader(inputFile));
	            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
	            String line = null;
	            String oldContent = null;
	            //Read from the original file and write to the new
	            //unless content matches data to be removed.
	            while ((line = br.readLine()) != null) {
//	                if (!line.trim().equals("System.out.println(Could not delete file);")) {
//	                    pw.println(line);
//	                    pw.flush();
//	                }
//	                if (!line.trim().equals("inputFile.delete()")) {
//	                    pw.println(line);
//	                    pw.flush();
//	                }
//	                if (!line.trim().equals("return;")) {
//	                    pw.println(line);
//	                    pw.flush();
//	                }
	            	oldContent+= line+System.lineSeparator();
	            	
	            }
	            pw.close();
	            br.close();

	 
	            //Delete the original file
	            if (!inputFile.delete()) {
	                System.out.println("Could not delete file");
	                return;
	            }
	            
	 
	            //Rename the new file to the filename the original file had.
	            if (!tempFile.renameTo(inputFile))
	                System.out.println("Could not rename file");
	            if (!inputFile.delete()) {
	                System.out.println("Could not delete file");
	                return;
	            }
	            deleteLine(oldContent, "D:\\tutorial\\wiki\\wiki1.txt");
	            }
	       catch (IOException ex) {
	            ex.printStackTrace();
	        }
	        
	 }
	        public static void deleteLine(String line, String filePath) {

	            File file = new File(filePath);

	            File file2 = new File(file.getParent() + "\\temp" + file.getName());
	            PrintWriter pw = null;
	            Scanner read = null;

	            FileInputStream fis = null;
	            FileOutputStream fos = null;
	            FileChannel src = null;
	            FileChannel dest = null;

	            try {


	                pw = new PrintWriter(file2);
	                read = new Scanner(file);

	                while (read.hasNextLine()) {

	                    String currline = read.nextLine();

	                    if (line.equalsIgnoreCase(currline)) {
	                        continue;
	                    } else {
	                        pw.println(currline);
	                    }
	                }

	                pw.flush();

	                fis = new FileInputStream(file2);
	                src = fis.getChannel();
	                fos = new FileOutputStream(file);
	                dest = fos.getChannel();

	                dest.transferFrom(src, 0, src.size());


	            } catch (IOException e) {
	                e.printStackTrace();
	            } finally {     
	                pw.close();
	                read.close();

	                try {
	                    fis.close();
	                    fos.close();
	                    src.close();
	                    dest.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }

	                if (file2.delete()) {
	                    System.out.println("File is deleted");
	                } else {
	                    System.out.println("Error occured! File: " + file2.getName() + " is not deleted!");
	                }
	            }

	        }
	   
}
