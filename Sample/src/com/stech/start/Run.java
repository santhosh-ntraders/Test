/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stech.start;

import com.stech.test.Test;
import com.stech.test.Test_Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Santhosh C
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Test_Service service = new Test_Service();
//        
//         Test port=service.getTestPort();
//         
//         System.out.println("++++++++++++++++++ value is: "+port.hello("santhosh"));
//         
         Map<String,String> map= new HashMap<String,String>();
         
         map.put("abc","Santhosh");
         map.put("def","kumar");
         map.put("ghi","Santhosh");
         
          System.out.println( invert(map));
         
        
    }
    
    
    
    public static Map<String,List<String>> invert(Map<String,String> map){
 
  Map<String,List<String>> map2=new HashMap<String,List<String>>();
   
         
 
 
   for(String key: map.keySet()){
    
       List<String> values= map2.get(map.get(key));
        if(values!=null){
          values.add(key);
 
                 map2.put(map.get(key),values);
} else{
   
                    List<String> newVal=new ArrayList<String>();
                   newVal.add(key);
                 map2.put(map.get(key),newVal);
}
 
 
  }
 
   return map2;
 
}
    
    
    
}
