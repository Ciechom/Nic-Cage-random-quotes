import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Quotes{
    ArrayList<String> cytaty = new ArrayList<String>();
    String fname =System.getProperty("user.dir")+"/src/quotes.txt";
    public void setCytaty(){
        try{BufferedReader br = new BufferedReader(new FileReader(fname));
            ArrayList<String> cytaty= new ArrayList<String>();
            int index=0;
            while(br.readLine()!=null){                                     //TODO czyta tylko linijke 3, albo ¿adn¹, teraz nie dziala wcale
                System.out.println("----");
                if(br.readLine().startsWith("#")){}
                else{
                    this.cytaty.add(index,br.readLine());
                    index++;
                }
            }
        }catch(Exception e){}
    }
}
