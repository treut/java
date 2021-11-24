import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import org.json.JSONArray;
import org.json.JSONObject;


public class JsonTest {

    public static void main(String[] args){


        JSONArray ja = new JSONArray();
        ja.put(new JSONObject().put("phone", "УК ЖК Волга Лайф\nтел: +7-920-685-20-50\ne-mail: uk-volga-life@yandex.ru\n\nПн, Вт, Ср, Пт - 8:00-10:30, 15:30-17:00\nЧт - 16:30-20:00\nСб, Вс - выходной"));
        ja.put(new JSONObject().put("phone", "Аварийно-диспетчерская служба (круглосуточно)\nтел: +7-4822-75-21-56"));
        ja.put(new JSONObject().put("phone", "Городская клиническая больница №7 (регистратура)\nтел: +7-4822-555-209 , +7-4822-555-055"));
        ja.put(new JSONObject().put("phone", "Служба безопасности ЖК\nтел: +7-920-697-12-63"));
        ja.put(new JSONObject().put("phone", "Обслуживание лифтов Ваш Лифт (круглосуточно)\nтел: +7-4822-77-30-35"));
        ja.put(new JSONObject().put("phone", "Участковый ЖК: Ильин Владислав Сергеевич\nтел: +7-999-160-08-78"));
        ja.put(new JSONObject().put("phone", "Инженер по эксплуатации: Тимофеев Михаил Александрович\nтел: +7-930-160-12-55"));
        ja.put(new JSONObject().put("phone", "Бухгалтер ЖК Ирина Викторовна\nтел: +7-930-159-55-83"));
        ja.put(new JSONObject().put("phone", "Специалист паспортного стола: Соловьева Светлана Николаевна\nтел: +7-900-010-56-99\ne-mail: 89000105699@mail.ru\n\n(прием граждан: Среда 15:30-17:00)"));


//        System.out.println(ja.getJSONObject(2).getString("phone"));


//        System.out.println();
//        JSONObject jjo = new JSONObject();
        for(Object jj : ja){
            JSONObject jjo = (JSONObject) jj;
//            System.out.println(jjo.getString("phone"));
        }

//        arr.add("best");
//        arr.add("mest");

//        Gson gson = new Gson();
//        String json = gson.toJson(arr);
//        System.out.println(json);

//        gson.fromJson(json, String.class);
//        var resu = gson.fromJson(json, ArrayList.class);


//        var jss = new JSONArray(arr);
//        System.out.println(jss.getJSONArray(1));

        try{
            InputStream fromurl = new URL("https://tver-life.ru/api/v2/getContacts.php?v=1.1.4").openStream();
            System.out.println(fromurl.toString());
        }
        catch(Exception e){}




//        System.out.println(resu.get(2));


    }
}
