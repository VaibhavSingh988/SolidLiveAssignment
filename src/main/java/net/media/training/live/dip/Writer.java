package net.media.training.live.dip;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {
    public boolean writeFile(ArrayList<String> list, String path) {
        boolean status = true;
        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(path))) {
            for (String line : list) {
                writer.write(line);
                writer.newLine(); // Ensures each line is written on a new line
            }
        } catch (IOException e) {
            e.printStackTrace();
            status = false;
        }
        return status;
    }
}
