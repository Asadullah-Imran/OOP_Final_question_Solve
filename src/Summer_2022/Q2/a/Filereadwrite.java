package Summer_2022.Q2.a;

import java.io.*;

public class Filereadwrite {

    public static void main(String[] args) {
        int count=0;

        try{
            BufferedReader bufferedReader= new BufferedReader(new FileReader("in.txt"));
            BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter("out.txt"));


            String line;
            while((line=bufferedReader.readLine())!=null){
               count++;
               bufferedWriter.write(line);
               bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();
        }catch (IOException e){

        }
        System.out.println("in.txt contains "+count);
    }
}
