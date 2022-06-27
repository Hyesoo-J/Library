package de.buw.se4de;

import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVWriter;
import java.io.*;
import java.nio.file.Paths;
import java.util.Arrays;


public class DBConnection {


	public static List<List<String>> booksDBList = new ArrayList<List<String>>();
    public static String[][] booksDB = new String[100][100]; //nayeem

    protected static String path = Paths.get("src/main/resources/booksDB.csv").getParent() + "\\" + "booksDB.csv";
    

    public static void readBooksDB() {
        String line = "";


        try {
            BufferedReader buffer = new BufferedReader(new FileReader(path));

            while ((line = buffer.readLine()) != null) {
                String[] data1D = line.split(",");
                booksDBList.add(Arrays.asList(data1D));
               // System.out.println(data1D.toString());
            }
        } catch (FileNotFoundException var5) {
            throw new RuntimeException(var5);
        } catch (IOException var6) {
            throw new RuntimeException(var6);
        }

        booksDB = booksDBList.stream().map((l) -> {
            return l.stream().toArray((x$0) -> {
                return new String[x$0];
            });
        }).toArray((x$0) -> {
            return new String[x$0][];
        });
    }

    public static void setBook(String bookID, String bookTitle, String author, String price, String publisher){

    	//It appears to me that the error is emerging for this following function but I could not find out the reason or resolution to it. //nayeem
        if (getIndex(bookID) != -1){System.out.println("The book is already registered!");}
        else {
            var copy = new String[booksDB.length + 1][booksDB[0].length + 1];
            for (int i = 0; i < booksDB.length; i++)
                for (int j = 0; j < booksDB[i].length; j++)
                    copy[i][j] = booksDB[i][j];
            for (int i = 0; i < booksDB[0].length; i++) {
            	//System.out.print(booksDB[0].length);
                copy[booksDB.length][i] = "null";
            }

            copy[booksDB.length][0] = bookID;
            copy[booksDB.length][1] = bookTitle;
            copy[booksDB.length][2] = author;
            copy[booksDB.length][3] = price;
            copy[booksDB.length][4] = publisher;
            booksDB = copy;
        }

    }


    public static int getIndex(String bookID){
        int index = -1;

        for (int i = 0 ; i < booksDB.length;i++){
            if (booksDB[i][0].toLowerCase().equals(bookID.toLowerCase())) return i;
        }

        return index;
    }

    public static void printbooks() {

        for (int i = 0; i < booksDB.length; i++) {
            for (int j = 0; j < booksDB[0].length; j++)

                System.out.println(booksDB[i][j]);


        }
        System.out.println("");
    }


    public static void writeBookInDB() {


        List<String[]> replica = new ArrayList<String[]>();
        try {
            // https://mkyong.com/java/how-to-export-data-to-csv-file-java/
            // create FileWriter object with file as parameter
            FileWriter outputFile = new FileWriter(path);
            // https://stackoverflow.com/questions/13969254/unwanted-double-quotes-in-generated-csv-file
            // https://www.geeksforgeeks.org/writing-a-csv-file-in-java-using-opencsv/
            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputFile, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.RFC4180_LINE_END);


            for (int i = 0; i < booksDB.length; i++) {

                replica.add(booksDB[i]);
            }

            writer.writeAll(replica);
            writer.close();
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
