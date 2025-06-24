package java_assign;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try{
//            creating file
            File file1=new File("src\\java_assign\\FileExample1.txt");
            if(file1.createNewFile()){
                System.out.println("File is created.");
            }else{
                System.out.println("Couldn't create the file.");
            }

//            writing to file
            String fileData="File handling.";
            FileWriter writer=new FileWriter("src\\java_assign\\FileExample1.txt");
            for(int i=0;i<fileData.length();i++){
                writer.write(fileData.charAt(i));
            }
            System.out.println("Writing successful");
            writer.close();

//            reading from file
            int FileCh;
            FileReader reader=null;
            try{
                reader=new FileReader("src\\java_assign\\FileExample1.txt");

            }catch(FileNotFoundException e){
                System.out.println("File not found.");
            }

            while ((FileCh=reader.read())!=-1){
                System.out.println((char)FileCh);
            }
            reader.close();

//            deleting file
//            if (file1.exists()){
//                file1.delete();
//            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
