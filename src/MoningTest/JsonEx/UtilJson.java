package MoningTest.JsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

public class UtilJson {

  public static JSONObject createJsonData() {
    /**
     * 모든 데이터를 담을 JSONObject 생성
     */
    JSONObject productInfo = new JSONObject();
    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 처리.
     * product_no
     * product_name
     */
    productInfo.put("product_no", 1);
    productInfo.put("product_name", "선풍기");

    /**
     * value로 Json을 가지는 프로퍼티 처리.
     * extra_product_info JSONObject 생성
     */
    JSONObject extra_product_info = new JSONObject();
    extra_product_info.put("price", 10000);
    extra_product_info.put("deliveryFee", 2000);
    productInfo.put("extra_product_info", extra_product_info);
    /**
     * value로 Array를 가지는 프로퍼티 처리.
     * item_list JSONArray 생성
     */
    JSONArray item_list = new JSONArray();
    /**
     * value로 Json을 가지는 프로퍼티 처리.
     * item_list.* JSONObject 생성하세요
     */
    JSONObject itemL = new JSONObject();
    itemL.put("item.no", 1);
    itemL.put("item.name", "최강 선풍기");
    item_list.put(itemL);
    JSONObject itemL2 = new JSONObject();
    itemL2.put("item.no", 2);
    itemL2.put("item.name", "최최강 선풍기");
    item_list.put(itemL2);
    productInfo.put("item_list", item_list);

    return productInfo;
  }

  public static void parseJsonData(JSONObject jsonObject) {

    /**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     */
    String jsonString = jsonObject.toString();

    /**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     */
    JSONObject jsonParse = new JSONObject(jsonString);

    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
     * product_no, product_name
     */

    int productNo = jsonParse.getInt("product_no");
    String productName = jsonParse.getString("product_name");
    System.out.println("상품 번호 : " + productNo);
    System.out.println("상품 이름 : " + productName);

    /**
     * value로 Json을 가지는 프로퍼티 조회.
     * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
     */
    JSONObject extraProduct = jsonParse.getJSONObject("extra_product_info");
    System.out.println("상품의 가격 : " + extraProduct.get("price"));
    System.out.println("상품의 배송비 : " + extraProduct.get("deliveryFee"));
    /**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     */
    JSONArray itemList = jsonParse.getJSONArray("item_list");
    for (Object o : itemList) {
      System.out.println("선풍기의 번호 : " + ((JSONObject) o).get("item.no"));
      System.out.println("선풍기의 이름 : " + ((JSONObject) o).get("item.name"));
    }
  }

  public static void parseJsonDataUseIterator(JSONObject jsonObject) {
    /**
     * String 형태로 만들어져있는 JSON 데이터를 파싱해줄 객체 생성.
     */

    /**
     * JSON 데이터가 String 형태로 들어왔음을 가정하기 위해
     * Json 데이터를 생성하고 String 형태로 바꿔주었다.
     */

    /**
     * value로 단순 값(string, int)를 가지는 프로퍼티 조회.
     * product_no, product_name
     */

    /**
     * value로 Json을 가지는 프로퍼티 조회.
     * extra_product_info를 꺼낼 때, JSONObject로 캐스팅.
     */

    /**
     * value로 Array를 가지는 프로퍼티 조회.
     * item_list를 꺼낼 때, JSONArray로 캐스팅.
     */

    /**
     * item_list의 각 원소를 JSONObject로 캐스팅 후, 변수의 키셋을 가져온다.
     * [참고] 각 원소의 키가 다를 경우 유용하다.
     */

  }

  public static String jsonToString(JSONObject jsonObject) {
    return jsonObject.toString();
  }

}
