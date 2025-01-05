import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        // ফোল্ডারের পাথ
        File folder = new File("C:\\Users\\Java Student PC-9\\Desktop\\Zakaria");

        // ফোল্ডার ডিলিট করার চেষ্টা
        if (deleteFolder(folder)) {
            System.out.println("Folder deleted successfully.");
        } else {
            System.out.println("Failed to delete folder. It might not exist or contains files.");
        }
    }

    // Recursive method to delete folder and its contents
    public static boolean deleteFolder(File folder) {
        if (folder.isDirectory()) {
            // যদি ডিরেক্টরি হয়, ভেতরের ফাইল বা ফোল্ডারগুলো ডিলিট করতে হবে
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    deleteFolder(file); // Recursive call
                }
            }
        }
        // ফোল্ডার বা ফাইল ডিলিট
        return folder.delete();
    }
}
