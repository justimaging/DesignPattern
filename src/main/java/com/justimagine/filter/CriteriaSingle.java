package com.justimagine.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @date 2022/7/12 22:52
 * @created by zhushuxian
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}