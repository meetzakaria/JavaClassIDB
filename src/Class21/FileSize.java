package Class21;

import java.io.File;

public class FileSize {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Java Student PC-9\\Desktop\\Terminal Command.txt";

        File file = new File(filePath);

        if (file.exists()) {
            long fileSizeInBytes = file.length();
            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;

            System.out.println("File Size:");
            System.out.println("Bytes: " + fileSizeInBytes + " bytes");
            System.out.println("KB: " + fileSizeInKB + " KB");
            System.out.println("MB: " + fileSizeInMB + " MB");
        } else {
            System.out.println("File was not Found");
        }
    }
}
