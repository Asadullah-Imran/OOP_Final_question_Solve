package Spring_2022.Q2;

import java.io.*;

public class FileProblem {
    public static void main(String[] args) {


        try{
            BufferedReader br= new BufferedReader( new FileReader("id.txt"));
            BufferedWriter bwo = new BufferedWriter(new FileWriter("odd.txt"));
            BufferedWriter bwe = new BufferedWriter(new FileWriter("even.txt"));
            String line;

            while ((line= br.readLine())!=null){
                int idNum=Integer.parseInt(line);
                System.out.println(idNum); // this is just to check the id (not mandatory)
                if(idNum%2==0){
                    bwe.write(line+"\n");
                }else {


                    bwo.write(line + "\n");
                }
            }

            br.close();
            bwo.close();
            bwe.close();
            System.out.println("success"); //this is just to check the try catch-block perfect well (not mandatory)
        }catch(IOException e){

        }
    }
}
