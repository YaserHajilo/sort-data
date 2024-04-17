
import org.json.simple.JSONObject;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;



class writer {
    public void w(JSONObject JSON) throws Exception {

        // برای نوشتن از کلاس زیر استفاده کرده
        String adr = add(JSON);
        FileWriter fileWriter = new FileWriter(adr, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.newLine();
        bufferedWriter.write(JSON.toString());
        bufferedWriter.close();
    }
    //این متد شی را گرفته اطلاعات id گرفته سپس مکان 7 را با کاراکتر اول ADDعوض کرده
    public String add(JSONObject json) {
        String S = json.get("id").toString();
        char[] ch = S.toCharArray();
        String ADD = "./data/7file.json";
        String adr = ADD.replace('7', ch[0]);
        return adr;

    }




}
