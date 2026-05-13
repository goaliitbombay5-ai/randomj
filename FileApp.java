import java.io.*;
import java.util.*;

public class FileApp{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int ch;
        do{
            System.out.println("\n1 Create\n2 Write\n3 Read\n4 Append\n5 Delete\n6 Exit");
            System.out.print("Choice: ");
            ch=sc.nextInt();
            sc.nextLine();

            try{
                switch(ch){

                    case 1:
                        System.out.print("File name: ");
                        String f=sc.nextLine();

                        File file=new File(f);

                        if(file.createNewFile())
                            System.out.println("Created");
                        else
                            System.out.println("Already exists");
                        break;

                    case 2:
                        System.out.print("File name: ");
                        f=sc.nextLine();

                        FileWriter fw=new FileWriter(f);
                        System.out.print("Enter text: ");
                        fw.write(sc.nextLine());
                        fw.close();
                        System.out.println("Written");
                        break;

                    case 3:
                        System.out.print("File name: ");
                        f=sc.nextLine();

                        BufferedReader br=new BufferedReader(new FileReader(f));
                        String line;

                        while((line=br.readLine())!=null)
                            System.out.println(line);

                        br.close();
                        break;

                    case 4:
                        System.out.print("File name: ");
                        f=sc.nextLine();

                        FileWriter fa=new FileWriter(f,true);
                        System.out.print("Append text: ");
                        fa.write("\n"+sc.nextLine());
                        fa.close();
                        System.out.println("Appended");
                        break;

                    case 5:
                        System.out.print("File name: ");
                        f=sc.nextLine();

                        File d=new File(f);
                        if(d.delete())
                            System.out.println("Deleted");
                        else
                            System.out.println("Not found");
                        break;
                }
            }
            catch(Exception e){
                System.out.println("Err: "+e.getMessage());
            }

        }while(ch!=6);

        sc.close();
    }
}