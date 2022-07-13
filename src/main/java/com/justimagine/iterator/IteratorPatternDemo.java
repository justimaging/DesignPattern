package com.justimagine.iterator;

/**
 * @Description TODO
 * @Date 2022/7/13 17:14
 * @Created by zhushuxian
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}