package Summer_2023.Q2.b;

import java.io.*;

public class FileWriting {
    public static void main(String[] args) {
        String in="input.txt";
        String out="output.txt";
        try{
        BufferedReader read = new BufferedReader(new FileReader(in));
         BufferedWriter writer = new BufferedWriter(new FileWriter(out));

         String line="";
         int sum=0;
         for(int i=0;i<2;i++){
             line=read.readLine();
             sum+= Integer.parseInt(line);
         }
//            System.out.println(sum);
         writer.write(String.valueOf(sum));

         read.close();
         writer.close();


        }catch (IOException e){
            System.out.println(e);
        }

    }
}
