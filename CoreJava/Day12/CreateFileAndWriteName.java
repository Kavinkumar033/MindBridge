package Day12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileAndWriteName {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        String con[] ={"Welcome !...","Kavin Kumar S"};
        try {
            bw = new BufferedWriter(new FileWriter("C:\\Users\\kavin\\OneDrive\\Desktop\\HandsOn\\CoreJava\\Day12\\NameIO.txt"));
            for(String str : con)
            {
                bw.write(str);
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try
            {
                if(bw!=null) {
                    bw.close();
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Content Added to File");
    }
    }

