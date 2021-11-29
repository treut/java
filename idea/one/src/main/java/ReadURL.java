import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadURL{
    private String url;
    public ReadURL(String url){
        this.url = url;
    }
    @Override
    public String toString(){
        try(BufferedReader buff = new BufferedReader(new InputStreamReader(new URL(url).openStream()))){
            String read;
            StringBuilder result = new StringBuilder();
            while((read = buff.readLine()) != null){
                result.append(read);
            }
            return result.toString();
        }
        catch(Exception e){
            return "error";
        }
    }
}