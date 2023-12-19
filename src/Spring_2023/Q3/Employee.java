package Spring_2023.Q3;

import javax.lang.model.element.Name;
import java.io.*;
import java.util.Scanner;

public class Employee {


    public static void main(String[] args) {










        // a) Take n number of employees‟ name, id, and last 6 months‟ performance scores as
        // user input from keyboard.

        //b) Now calculate each employee‟s average score and write all the employee‟s information in a file named
        //„employee.txt‟. Put each information in separate lines as follows

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number of Employees: ");
        int n=scanner.nextInt();
        scanner.nextLine(); //this is beacuse we only take the integer not the full line so this .nextLine() will consume the full line including "\n" character

        try{
            //Creatyeing Writing file to write the all data
            BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter("employee.txt"));

            for(int i=0;i<n;i++){
                System.out.println("Employee: "+(i+1));
                System.out.println("Name: ");
                String name= scanner.nextLine();
                System.out.println("ID: ");
                String id= scanner.nextLine();
                double avgScore=0;
                System.out.println("add last 6 months score: ");
                for (int j=0;j<3;j++){
                    System.out.println("Month " + (j+1)+" score :");
                    double score= scanner.nextDouble();

                    avgScore+=score;
                }
                scanner.nextLine();
                avgScore=avgScore/3;
                String sAvgScore= String.valueOf(avgScore);

                bufferedWriter.write(name);
                bufferedWriter.newLine(); //this is do the same as "\n"
                bufferedWriter.write(id+"\n");
                bufferedWriter.write(sAvgScore+"\n");
            }
            bufferedWriter.close();
            // still this code a and b is completed


            // now we will do the c and d

            BufferedReader bufferedReader = new BufferedReader(new FileReader("employee.txt"));
            BufferedWriter bufferedWriter2= new BufferedWriter(new FileWriter("increment.txt"));

            String line="";
            String nameLine="";
            String idLine="";
            String avgScoreLine="";
            int lineNumber=0;
            double max=0;
            String maxName="";
            String maxId="";
            while((line=bufferedReader.readLine())!=null){
                nameLine=idLine;
                idLine=avgScoreLine;
                avgScoreLine=line;
                lineNumber++;
                if(lineNumber%3==0){
                    double avgdouble= Double.parseDouble(avgScoreLine);
                    if(avgdouble>75){
                        bufferedWriter2.write(nameLine);
                        bufferedWriter2.newLine(); //this is do the same as "\n"
                        bufferedWriter2.write(idLine+"\n");
                        bufferedWriter2.write(avgScoreLine+"\n");
                    }

                    if (avgdouble>max){
                        max=avgdouble;
                        maxName=nameLine;
                        maxId=idLine;
                    }

                }

            }

            bufferedReader.close();
            bufferedWriter2.close();
            System.out.println("Maximum average Holder");
            System.out.println("Name: "+maxName);
            System.out.println("id: "+maxId);
            System.out.println("Average score: "+max);


            System.out.println("success");

        }catch (IOException e){

        }


    }
}
