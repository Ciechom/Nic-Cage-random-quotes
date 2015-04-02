import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Quotes{
    ArrayList<String> cytaty = new ArrayList<String>();
    public void setCytaty(){
        try{BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"quotes.txt"));
            System.out.println(System.getProperty("user.dir")+"quotes.txt");
            ArrayList<String> cytaty= new ArrayList<String>();
            int index=0;
            while(br.readLine()!=null){
                if(br.readLine().startsWith("#")){}
                else{
                    cytaty.add(index,br.readLine());
                    index++;
                }
            }
            this.cytaty=cytaty;
        }catch(Exception e){}
    }
}
