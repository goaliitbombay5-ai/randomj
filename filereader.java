import java.io.*;
class filereader{
    public static void main(String[] args){
        try{
            FileReader fr=new FileReader("filelist.java");//to change path
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}