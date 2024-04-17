import org.json.simple.JSONObject;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;




public class Json  {
    public  void JSON(String id,String name,String family,String age)throws Exception {

        //date تاریخ سیستم را گرفته
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/ MM/ dd");
        String DATE = simpleDateFormat.format(date);
// ما با متد بالا تاریخ را ساده سازی کرده
// ممکن است اطلاعات کاربر به صورت حروف کوچک و بزرگ باشد ما انها به یک شکل کرده و تمامی فاصله ها را پاک کرد
        String NAME = name.toLowerCase().replaceAll("\\s", "");
        String FAMILY = family.toLowerCase().replaceAll("\\s", "");
        String ID = id.toLowerCase().replaceAll("\\s", "");
// با کلاس jsonیک شی json ساخته
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", new String(ID));
        jsonObject.put("name", new String(NAME));
        jsonObject.put("family", new String(FAMILY));
        jsonObject.put("age", new Integer(age));
        jsonObject.put("date", new String(DATE));
        // کلاس نوشتن فایل در فراخوانده
        writer writer=new writer();
        writer.w(jsonObject);


    }
}
