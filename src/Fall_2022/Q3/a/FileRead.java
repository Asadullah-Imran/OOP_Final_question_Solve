package Fall_2022.Q3.a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public static void main(String[] args) {
        try{
            int age=getAge(new FileReader("person.txt"));
            System.out.println(age);

        }catch(IOException e){
            e.printStackTrace();
        }

    }
    static int getAge(FileReader file) throws IOException{
        int maxAge=0;
        BufferedReader bufferedReader= new BufferedReader(file);
        String line;
        while((line=bufferedReader.readLine())!=null){
            String parts[]=line.split("/");
            int age= Integer.parseInt(parts[1]);
            if(age>maxAge){
                maxAge=age;
            }
        }
        return maxAge;

    }
}
