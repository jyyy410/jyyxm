package com.niit.集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HashMapTest
{

    /**
     * [hash算法：一种算法,对元素进行计算,并获取其位置 每个对象都有hash值，每个对象都是object的子类，由底层实现
     * 好就好在，找起来快，缺点，不能重复 hash map 键可以重复，值不可以重复 不同步
     * ,一个键最多只能对应一个值，map集合k就是主键。hashcode相同 对象不一定相同
     * 
     * hash表判断元素是否相同，判断hash值是否相同 如果相同，再判断两个对象的内容是否相同。
     * 
     * 
     * 重写 equal为什么呀 重新hashcode
     * 
     * 如果不重写equal
     * 同类的两个对象不相同，假如你要定义姓名相同的同一类对象相同，不重写，永远不相同，因为equal默认是objectequal方法==
     * 
     * 不重写hashcode 姓名相同的hashcode永远不相同，永远可以存，无法满足hash不重复特性，会出现重复的数据。 ]
     * 
     * 
     * 
     * 
     * 
     * 
     * [put(,value) 返回上一个key相同的元素] remove删除 clear清除所有 containKey(key)包含键吗
     * get(Key)
     * 
     * map迭代, 1 .map没有迭代器，拿到key集合，遍历key集合set 2. 拿到key value集合
     * map.entry,Map.Entry是键值关系的类型，是map接口中的静态接口
     * 
     * 
     * map实现类
     * 
     * hashTable  同步 key value不能为空  子类proerties
     * hashmap 不同步  key value可以为空
     * 
     * treemap  
     * 
     * linkHashMap  
     * 
     * 
     * 
     * @param args
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("a", "1");
        hashMap.put("b", "2");
        System.out.println(hashMap.put("b", "3"));
        hashMap.size();// 获取键值对的个数

        System.out.println(hashMap);
        System.out.println(hashMap.containsKey("a"));
        // System.out.println(hashMap.remove("b"));
        bainliMap(hashMap);
        
        entryTest(hashMap);
        
        valuesTest(hashMap);
        
        hashTableTest();

    }

    // keyset联系
    public static void bainliMap(Map<String, String> map) {
        map.entrySet();
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
      
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            System.out.println("key:" + key);

        }
    }
    //entry练习
    public static void entryTest(Map<String, String> map) {
        Set<Map.Entry<String, String>> entries = map.entrySet();
       Iterator<Map.Entry<String, String>> entry =entries.iterator();
        while(entry.hasNext()){
          Map.Entry<String  , String> next=  entry.next();
          System.out.println("-key-value-----"+next.getKey()+next.getValue());
          
        }
    }
    
    public static void valuesTest(Map<String, String> map) {
        Collection<String> valueTest= map.values();
        Iterator<String> iterator= valueTest.iterator();
        while (iterator.hasNext()) {
            System.out.println("values:"+iterator.next());
        }
    }
    
    
    public static void hashTableTest() {
        Hashtable<Object, Object> hashtable= new Properties();
        hashtable.put("a", "a123");
        System.out.println(hashtable);
    }
    // foreach 不能直接遍历map结合，map集合转换成keyset  entry set
    public static void hashMapForEachTest(Map<String, String> map) {
        for (String striIterator : map.keySet()){
        }
    }
    
    public static void hashMapForEachByMapEntry(Map<String, String> map) {
        for (Map.Entry<String, String>  mEntry: map.entrySet()) {
            
        }
    }

}
