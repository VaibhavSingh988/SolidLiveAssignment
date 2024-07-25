package net.media.training.live.dip;

public class DatabaseWriter {
    private static final MyDatabase database = new MyDatabase();

    public boolean writeToDB(String data) {
        database.write(data);
        return true;
    }
}
