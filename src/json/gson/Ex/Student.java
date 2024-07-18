package json.gson.Ex;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

  private int id;
  private String name;


  String getJson() {
    /*JSONObject jsonObject = new JSONObject();
    jsonObject.put("id", this.id);
    jsonObject.put("name", this.name);
    return jsonObject.toString();*/
    Gson gson = new Gson();
    String studentJson = gson.toJson(this);
    return studentJson;
  }

  Student changeStudent() {
    Gson gson = new GsonBuilder().disableHtmlEscaping()
        .create();
    String jsonStudent = "{\"id\":2,\"name\":\"신세계\"}";
    Student student = gson.fromJson(jsonStudent, Student.class);
    return student;
  }

}
