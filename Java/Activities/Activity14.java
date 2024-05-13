package org.activity;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Activity14 {

    public static void main(String[] args) throws IOException {
        try {
            File file = new File("input//newFile.txt");
            if(file.createNewFile()) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }

            FileWriter myWriter = new FileWriter("input//newFile.txt");
            myWriter.write("This is the newly created files.");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

            //get the file Object
            File fileUtil = FileUtils.getFile("input//newFile.txt");
            //Read file
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

            //Create directory
            File destDir = new File("output//");
            //Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);

            //Get file from new directory
            File newFile = FileUtils.getFile(destDir, "newFile.txt");
            //Read data from file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            //Print it
            System.out.println("Data in new file: " + newFileData);
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
    }
}
