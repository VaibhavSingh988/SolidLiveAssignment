package net.media.training.live.dip;

import java.io.IOException;
import java.util.ArrayList;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule = new EncodingModule();

        // Reading from file, encoding, and writing to a file
        String readFilePath = "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt";
        Reader fileReader = new Reader();
        ArrayList<String> list = fileReader.readFile(readFilePath);
        ArrayList<String> encodedList = encodingModule.encode(list);
        String writeFilePath = "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt";
        Writer fileWriter = new Writer();
        if (fileWriter.writeFile(encodedList, writeFilePath)) {
            System.out.println("Successfully Data written into File.");
        }

        // Reading from database, encoding, and writing into local DB
        DatabaseReader databaseReader = new DatabaseReader();
        String data = databaseReader.readFromDB();
        String encodedData = encodingModule.encode(data);
        DatabaseWriter databaseWriter = new DatabaseWriter();
        if (databaseWriter.writeToDB(encodedData)) {
            System.out.println("Successfully Data written into local DB.");
        }
    }
}
