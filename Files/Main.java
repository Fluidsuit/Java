import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Main {
    public static void main(String[] args) {

        String basePath = "/Users/vishal/java/core java/workspaces/demo_files";

        FileUtil.delete(basePath);

        //FileUtil.printFileTree(basePath, 0);
        //FileUtil.printFileTree("/Users/vishal", 0);


        /*File dir = new File(basePath);
        File [] files = dir.listFiles();

        for(File file : files) {
            System.out.println(file.getName());
            if(file.isDirectory()) {
                File [] files1 = file.listFiles();
                for(File f1 : files1) {
                    System.out.println("\t" + f1.getName());
                    if(f1.isDirectory()) {
                        File [] files2 = f1.listFiles();
                        for(File f2 : files2) {
                            System.out.println("\t\t" + f2.getName());
                        }
                    }
                }
            }
        }*/


        //FileUtil.deleteDirectory(basePath + "java-students");
        //FileUtil.createDirectory(basePath + "java-students/assignments/simple");

        //FileUtil.createDirectory(basePath + "java-students");
        //FileUtil.deleteDirectory(basePath + "java-students");

        //FileUtil.createFile(basePath + "bitcode-students-data.bin");
        //FileUtil.createFile(basePath + "info.txt");

        /*FileUtil.deleteFile(basePath + "bitcode-students-data.bin");
        FileUtil.deleteFile(basePath + "info.txt");*/

        /*FileUtil.printFileInfo(basePath + "info.txt");
        FileUtil.printFileInfo(basePath + "my-info.txt");
        FileUtil.printFileInfo(basePath);*/

        //File demoFiles = new File(basePath);
        //File [] files = demoFiles.listFiles();
        /*File [] files = demoFiles.listFiles(
                new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        System.out.println("Checking: " + name);
                        return name.endsWith(".txt");
                    }
                }
        );*/
        /*File [] files = demoFiles.listFiles(
                new FileFilter() {
                    @Override
                    public boolean accept(File file) {
                        return file.length() > 100;
                    }
                }
        );
        System.out.println();
        for(File file : files) {
            System.out.println(file.getName() + " - " + file.length());
        }*/

        /*String [] fileNames = demoFiles.list();
        for(String fileName : fileNames) {
            System.out.println(fileName);
        }*/

        //String [] fileNames = demoFiles.list(new MyFileNameFilter());
        /*String [] fileNames = demoFiles.list(
                new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        return new File(dir, name).length() > 100;
                        //return name.startsWith("p") || name.endsWith(".mp3");
                    }
                }
        );
        for(String fileName : fileNames) {
            System.out.println(fileName);
        }*/
    }
}


class MyFileNameFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".txt");
    }
}