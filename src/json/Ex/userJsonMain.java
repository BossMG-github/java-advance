package json.Ex;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import org.json.JSONArray;
import org.json.JSONObject;

public class userJsonMain {

  public static void main(String[] args) throws IOException {
    JSONObject root = new JSONObject();

    root.put("name", "SMG");
    root.put("age", "24");
    root.put("isMarried", false);

    JSONArray hobbies = new JSONArray();
    hobbies.put("운동");
    hobbies.put("컴퓨터");
    hobbies.put("밥 먹기");
    root.put("hobbies", hobbies);
    JSONObject address = new JSONObject();
    address.put("address", "신세계");
    root.put("address", address);

    String jsonStr = root.toString();
    System.out.println(jsonStr);

    Writer jsonWriter = new FileWriter("C:\\Temp\\user.json");
    jsonWriter.write(jsonStr);
    jsonWriter.flush();
    jsonWriter.close();

  }
}
