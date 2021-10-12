package ex41;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 *  UCF COP3330 Fall 2021 Assignment 41 Solution
 *  Copyright 2021 Jose Malave
 */
public class App {

    //in this method, we are going to take in the
    public static void output_File(String path)
    {


        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            BufferedWriter writer = new BufferedWriter(new FileWriter("exercise41_output.txt"));
            ArrayList names = new ArrayList();
            String line = "";

            //here we are going to read in line by line into a list array
            while(  (line = br.readLine()) != null  )
            {
                names.add(line);
            }

            //then we are going to want to sort out the listarray
            Collections.sort(names);

            //now we are going to write out the sorted list to the output file
            for (int i = 0; i < names.size(); i++)
            {
                writer.write("\n" + names.get(i).toString());
            }


            //close the writer and the reader
            writer.close();
            br.close();

        //here we want to catch if there are any errors when trying to writer to the or
            // read the file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    //here in the main, we send the path of the input file to the method above
    public static void main(String[] args) {
        String path = "C:\\Users\\JD\\Desktop\\COP3330\\assign1_part3\\Malave-COP3330-ex42\\exercise41_input.txt";
        output_File(path);
    }
}


