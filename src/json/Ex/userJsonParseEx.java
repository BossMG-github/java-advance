package json.Ex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONObject;

public class userJsonParseEx {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
        new FileReader("C:\\Temp\\user.json", StandardCharsets.UTF_8));
    String json = br.readLine();
    br.close();

    JSONObject root = new JSONObject(json);

    System.out.println(root.getString("name"));
    System.out.println(root.getString("age"));
    System.out.println(root.getBoolean("isMarried"));
    JSONObject address = root.getJSONObject("address");
    System.out.println(address.getString("address"));

    JSONArray hobbies = root.getJSONArray("hobbies");
    System.out.print("hobbies : ");
    for (int i = 0; i < hobbies.length(); i++) {
      System.out.print(hobbies.get(i) + " , ");
    }
  }
}
