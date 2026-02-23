import java.io.File;
import java.io.IOException;

public class FileUtil {

    public static void delete(String filePath) {
        File file = new File(filePath);
        if(!file.exists()) {
            return;
        }

        if(file.isFile()) {
            //delete the file and return the job is done
            file.delete();
            return;
        }

        //file is a directory
        //delete all the files under that directory
        String [] fileNames = file.list();
        for(String fileName : fileNames) {
            delete(filePath + "/" + fileName);
        }

        //Now delete the directory as it is empty
        file.delete();
    }

    public static void printFileTree(String filePath, int tabs) {
        File file = new File(filePath);
        if(!file.exists()) {
            return;
        }

        for(int i = 0; i < tabs; i++) {
            System.out.print("\t");
        }
        System.out.println(file.getName());

        if(file.isFile()) {
            return;
        }

        String [] fileNames = file.list();
        for(String fileName : fileNames) {
            printFileTree(filePath + "/" + fileName, tabs + 1);
        }

    }

    public static boolean createDirectory(String dirPath) {
        File dir = new File(dirPath);
        //return dir.mkdir();
        return dir.mkdirs();
    }

    public static boolean deleteDirectory(String dirPath) {
        File dir = new File(dirPath);
        return dir.delete();
    }
    
    public static boolean deleteFile(String filePath) {
        File file = new File(filePath);
        return file.delete();
    }

    public static boolean createFile(String filePath) {
        File file = new File(filePath);
        try {
            return file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printFileInfo(String filePath) {
        File file = new File(filePath);

        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length());
        System.out.println("Exists: " + file.exists());
        System.out.println("Modified: " + file.lastModified());
        System.out.println("Is File: " + file.isFile() + " Is Dir: " + file.isDirectory());
        System.out.println("RWE: " + file.canRead() + " " + file.canWrite() + " " + file.canExecute());
        System.out.println("Parent: " + file.getParentFile().getName());
        System.out.println("Is hidden: " + file.isHidden());
        System.out.println("----------------------");

    }
}
