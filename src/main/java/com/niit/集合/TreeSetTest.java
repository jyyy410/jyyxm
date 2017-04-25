package com.niit.集合;


public class TreeSetTest
{

    /**
     * [一句话功能简述] [set是无插入顺序的，但是有指定的排序，不同步的,必须实现compareabel接口实现compareTo方法  ,本对象和传入参数比较，==0就代表相等,
     * 如果对象不是自己定义的，没有自然排序的comparable方法，可以在构造集合的时候，传入一个实现接口的比较器，优先级大于集合内对象的比较器。
     * treeSet 按照插入顺序存的话就固定 comppareto永远返回1   正序，不重复，
     * ]  
     * 
     * @param args
     * @exception/throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args) {
       /* TreeSet<String> set = new TreeSet<String>();

        set.add("b");
        set.add("a");
        set.add("c");
        System.out.println(set);

        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            String string = (String) setIterator.next();
            System.out.println(string);

        }*/
        
     /*   TreeSet<Person> set = new TreeSet<Person>(comparator)
        Person person = new Person("a", 1);
        Person person2 = new Person("b", 1);
        set.add(person);
        set.add(person2);
        
        Iterator<Person> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            Person string = (Person) setIterator.next();
            System.out.println(string.getName());

        }
     */

    }
    //按照字符串的长度排序  str1.length=str2.length  如果字符串长度相等，用str1.compareTo(str2)
    public void miashiti() {
        
    }

}
