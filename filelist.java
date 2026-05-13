import java.io.*;
class filelist{
    public static void main(String[] args){
        File f=new File("D:/JAVA PROGS");//to change path
        File[] list=f.listFiles();
        if(list!=null){
            for(File x:list){
                if(x.isDirectory())
                    System.out.println("Dir: "+x.getName());
                else
                    System.out.println("File: "+x.getName());
            }
        }
        else
            System.out.println("Invalid path");
    }
}