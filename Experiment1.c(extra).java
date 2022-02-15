import java.util.*;
import java.io.*;
class Exp3
{
   public static void main(String args[])throws Exception{
   {
     // try{
      FileInputStream fin = new FileInputStream("tgwf.txt");
      int i;
      while((i=fin.read())!=-1)
          System.out.println((char)i);
      fin.close();
      }
     // catch(FileNotFoundException e){
     //    System.out.println(e);
     // }

}
}
