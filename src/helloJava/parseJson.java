/**
 * 
 */
package helloJava;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @author 2192
 *
 */
public class parseJson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello,java");
		
		tree hu=new tree();
		hu.setId(100000);
		hu.setName("huyu");
		hu.setAge(40);
		
		//JSONObject jo =JSONObject.fromObject(hu);
		
		//jo.put("name", "huyu");
		
		//System.out.println(jo);
		
		
		String JSONString="[{\"name\":\"huyu\",\"age\":23},{\"name\":\"hujiazhen\",\"age\":26}]";
		JSONArray ja=JSONArray.fromObject(JSONString);
		
		for(int i=0;i<ja.size();i++){
            JSONObject jo= ja.getJSONObject(i); //转换成JSONObject对象
            System.out.println(jo.get("name"));

        }
		
		// 数组形式的json
        final String JSON_ARRAY = "[{'name':'tom'},{'name':'john','age':20},{}]";

        JSONArray arr = JSONArray.fromObject(JSON_ARRAY);
        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            JSONObject obj = arr.getJSONObject(i);
            System.out.println(obj.toString());
        }
		
        JSONObject obj = new JSONObject();
        obj.put("name", "tom");
        obj.put("age", 19);

        // 子对象
        JSONObject objContact = new JSONObject();
        objContact.put("tel", "123456");
        objContact.put("email", "tom@test.com");
        obj.put("contact", objContact);

        // 子数组对象
        JSONArray scoreArr = new JSONArray();
        JSONObject objEnglish = new JSONObject();
        objEnglish.put("course", "english");
        objEnglish.put("result", 100);
        objEnglish.put("level", "A");

        JSONObject objMath = new JSONObject();
        objMath.put("course", "math");
        objMath.put("result", 50);
        objMath.put("level", "D");

        scoreArr.add(objEnglish);
        scoreArr.add(objMath);

        obj.put("score", scoreArr);

        System.out.println(obj.toString());
        
	}//main function

}//class
