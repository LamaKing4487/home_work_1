package practice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FilesMain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BufferedReader reader = null;
        boolean opened;
        do{
            opened = true;
            System.out.println("введите адрес файла");
            String filePath = scan.nextLine();
            Path pathToFile = Path.of(filePath);
            try {
                 reader = new BufferedReader(
                        new FileReader(pathToFile.toFile())
                );
            } catch (FileNotFoundException e) {
                System.out.println("ввели неверный адрес");
                opened = false;
            }
        }while(!opened);

        List<String> data = new ArrayList<>();
        try {
            Character a;
           int stfFromFile;
           StringBuilder builder = new StringBuilder();
           while ((stfFromFile =  reader.read()) != -1) {
               if(Character.isLetterOrDigit(stfFromFile)){
                   builder.append(stfFromFile);
               }else{
                   if(builder.length() > 0){
                       data.add(builder.toString());
                       builder.setLength(0);
                   }
               }
           }
            data.add(builder.toString());
        }catch(IOException e){
            System.out.println("проблемы при чтении файла");
        }
        System.out.println(data);
    }




}
