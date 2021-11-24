import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import org.json.JSONArray;
import org.json.JSONObject;


public class JsonTest {

    public static void main(String[] args){


        List<String> c = new ArrayList<>();
        JSONArray ja = new JSONArray();

        c.add("УК ЖК Волга Лайф\nтел: +7-920-685-20-50\ne-mail: uk-volga-life@yandex.ru\n\nПн, Вт, Ср, Пт - 8:00-10:30, 15:30-17:00\nЧт - 16:30-20:00\nСб, Вс - выходной");
        c.add("Аварийно-диспетчерская служба (круглосуточно)\nтел: +7-4822-75-21-56");
        c.add("Городская клиническая больница №7 (регистратура)\nтел: +7-4822-555-209 , +7-4822-555-055");
        c.add("Служба безопасности ЖК\nтел: +7-920-697-12-63");
        c.add("Обслуживание лифтов Ваш Лифт (круглосуточно)\nтел: +7-4822-77-30-35");
        c.add("Участковый ЖК: Ильин Владислав Сергеевич\nтел: +7-999-160-08-78");
        c.add("Инженер по эксплуатации: Тимофеев Михаил Александрович\nтел: +7-930-160-12-55");
        c.add("Бухгалтер ЖК Ирина Викторовна\nтел: +7-930-159-55-83");
        c.add("Специалист паспортного стола: Соловьева Светлана Николаевна\nтел: +7-900-010-56-99\ne-mail: 89000105699@mail.ru\n\n(прием граждан: Среда 15:30-17:00)");
        for(String cs : c){
            ja.put(new JSONObject().put("phone", cs));
        }


//        System.out.println(ja.getJSONObject(2).getString("phone"));


//        System.out.println(ja);

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

//        InputStream fromurl;
//        int read;

    System.out.println(new ReadURL("https://tver-life.ru/api/v2/getContacts.php?v=1.1.4"));

    }
}
