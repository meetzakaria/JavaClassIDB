import java.io.File;

public class CreateFolderUsingNIO {
    public static void main(String[] args) {
      File file = new File ("C:\\Users\\Java Student PC-9\\Desktop\\Zakaria");


      boolean mkdir = file.mkdir();
      if(mkdir){
          System.out.println("Folder create");
      }else{
          System.out.println("Folder");
      }
        file.mkdirs();

    }

}
