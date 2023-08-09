import javax.swing.*;

import java.io.*;

public class FileClass extends JFrame{

    static String filePath, parentDirectory;
    static File randomDir, randomFile, randomFile2;

    public static void main(String[] args){

        String dirPathName = "";
        randomDir = new File(dirPathName);

        randomDir.mkdir();

        randomFile = new File("random.txt");

        String randomFileInDirPathName = "";
        randomFile2 = new File(randomFileInDirPathName);

        try{

            randomFile.createNewFile();
            randomFile2.createNewFile();

            filePath = randomFile.getCanonicalPath();

        }
        catch(IOException e){

            e.printStackTrace();
        }

        if(randomFile.exists()){

            System.out.println("File Exists");

            System.out.println("File Readable " + randomFile.canRead());

            System.out.println("File Writable " + randomFile.canWrite());

            System.out.println("File Location " + filePath);

            System.out.println("File Name " + randomFile.getName());

            System.out.println("Parent Directory " + randomFile.getParent());

            System.out.println("Parent Directoty " + randomFile2.getParent());

            System.out.println("Is it a Directory " + randomDir.isDirectory());

            String[] filesInDir = randomDir.list();

            System.out.println("Files in Directory\n");

            for(String fileName : filesInDir){

                System.out.println(fileName + "\n");
            }

            System.out.println("Is a File " + randomFile.isFile());

            System.out.println("Is Hidden " + randomFile.isHidden());

            System.out.println("Last Modified " + randomFile.lastModified());

            System.out.println("File Size " + randomFile.length());

            String randomFileInDirPathNewName = "";

            randomFile2.renameTo(new File(randomFileInDirPathNewName));

            new FileClass();
        } else {

            System.out.println("File doesn't exist");
        }

        if(randomFile.delete()){

            System.out.println("File Deleted");
        }

        File[] filesInDir = randomDir.listFiles();

        for(File fileName : filesInDir){
            fileName.delete();
        }

        if(randomDir.delete()){

            System.out.println("Directory Deleted");
        }

    }

    public FileClass(){

        JFileChooser fileChooser = new JFileChooser(randomDir);

        fileChooser.showOpenDialog(this);
    }

}
