package test;


import java.io.FileReader; 
import java.util.Iterator; 
import java.util.Map; 

import org.json.simple.*;
import org.json.simple.parser.*;


public class JSONTest {
    
    
 public static void main(String[] args) throws Exception  
    { 
        // parsing file "JSONExample.json" 
        Object obj = new JSONParser().parse("{\"records\":[{\"id\":\"60\",\"name\":\"Rolex Watch\",\"description\":\"Luxury watch.\",\"price\":\"25000\",\"category_id\":\"1\",\"category_name\":\"Fashion\"},{\"id\":\"48\",\"name\":\"Bristol Shoes\",\"description\":\"Awesome shoes.\",\"price\":\"999\",\"category_id\":\"5\",\"category_name\":\"Movies\"},{\"id\":\"42\",\"name\":\"Nike Shoes for Men\",\"description\":\"Nike Shoes\",\"price\":\"12999\",\"category_id\":\"3\",\"category_name\":\"Motors\"},{\"id\":\"31\",\"name\":\"Amanda Waller Shirt\",\"description\":\"New awesome shirt!\",\"price\":\"333\",\"category_id\":\"1\",\"category_name\":\"Fashion\"},{\"id\":\"28\",\"name\":\"Wallet\",\"description\":\"You can absolutely use this one!\",\"price\":\"799\",\"category_id\":\"6\",\"category_name\":\"Books\"},{\"id\":\"26\",\"name\":\"Another product\",\"description\":\"Awesome product!\",\"price\":\"555\",\"category_id\":\"2\",\"category_name\":\"Electronics\"},{\"id\":\"13\",\"name\":\"Abercrombie Allen Brook Shirt\",\"description\":\"Cool red shirt!\",\"price\":\"70\",\"category_id\":\"1\",\"category_name\":\"Fashion\"},{\"id\":\"12\",\"name\":\"Abercrombie Lake Arnold Shirt\",\"description\":\"Perfect as gift!\",\"price\":\"60\",\"category_id\":\"1\",\"category_name\":\"Fashion\"},{\"id\":\"11\",\"name\":\"Huawei Y300\",\"description\":\"For testing purposes.\",\"price\":\"100\",\"category_id\":\"2\",\"category_name\":\"Electronics\"},{\"id\":\"10\",\"name\":\"Sony Smart Watch\",\"description\":\"The coolest smart watch!\",\"price\":\"300\",\"category_id\":\"2\",\"category_name\":\"Electronics\"},{\"id\":\"9\",\"name\":\"Spalding Watch\",\"description\":\"My sports watch.\",\"price\":\"199\",\"category_id\":\"1\",\"category_name\":\"Fashion\"},{\"id\":\"8\",\"name\":\"Samsung Galaxy Tab 10.1\",\"description\":\"Good tablet.\",\"price\":\"259\",\"category_id\":\"2\",\"category_name\":\"Electronics\"},{\"id\":\"7\",\"name\":\"Lenovo Laptop\",\"description\":\"My business partner.\",\"price\":\"399\",\"category_id\":\"2\",\"category_name\":\"Electronics\"},{\"id\":\"1\",\"name\":\"LG P880 4X HD\",\"description\":\"My first awesome phone!\",\"price\":\"336\",\"category_id\":\"3\",\"category_name\":\"Motors\"},{\"id\":\"2\",\"name\":\"Google Nexus 4\",\"description\":\"The most awesome phone of 2013!\",\"price\":\"299\",\"category_id\":\"2\",\"category_name\":\"Electronics\"},{\"id\":\"3\",\"name\":\"Samsung Galaxy S4\",\"description\":\"How about no?\",\"price\":\"600\",\"category_id\":\"3\",\"category_name\":\"Motors\"},{\"id\":\"6\",\"name\":\"Bench Shirt\",\"description\":\"The best shirt!\",\"price\":\"29\",\"category_id\":\"1\",\"category_name\":\"Fashion\"}]}");
          
        // typecasting obj to JSONObject 
        JSONObject jo = (JSONObject) obj; 
          
        // getting address 
//        Map address = ((Map)jo.get("address")); 
        // iterating address Map 
//        Iterator<Map.Entry> itr1 = address.entrySet().iterator(); 
//        while (itr1.hasNext()) { 
//            Map.Entry pair = itr1.next(); 
//            System.out.println(pair.getKey() + " : " + pair.getValue()); 
//        } 
          

        JSONArray ja = (JSONArray) jo.get("records"); 
        Iterator itr2 = ja.iterator(); 
          
        while (itr2.hasNext())  
        { 
            Object obj2 = itr2.next();
            JSONObject jo2 = (JSONObject) obj2; 
                String description = (String) jo2.get("description");   
                System.out.println(description);              
        }
    }
}
