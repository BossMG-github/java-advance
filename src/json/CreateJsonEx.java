package json;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonEx {

  public static void main(String[] args) throws IOException {
    // json 객체 생성
    JSONObject root = new JSONObject();

    // 스트링 속성 추가
    root.put("id", "ssg01");
    root.put("name", "신세계");
    root.put("dept", "IT");
    root.put("job", "developer");

    // 객체 속성 추가
    JSONObject phone = new JSONObject();
    phone.put("home ", "02-3245- 8890");
    phone.put("handphone1", "010-4454-8898");
    phone.put("hadphone2", "010-4454-9988");

    // 배열 객체 속성 추가
    JSONArray skill = new JSONArray();
    skill.put("java");
    skill.put("c");
    skill.put("C++");
    skill.put("C#");
    root.put("skill", skill);

    // JSON 객체
    String jsonValue = root.toString();

    // 출력
    System.out.println(root);

    // 파일로 저장
    Writer jsonWriter = new FileWriter("C:/Temp/employee.json", Charset.forName("UTF-8"));
    jsonWriter.write(jsonValue);
    jsonWriter.flush();
    jsonWriter.close();

  }
}
