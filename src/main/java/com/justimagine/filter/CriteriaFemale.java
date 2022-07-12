package com.justimagine.filter;

import java.util.ArrayList;
import java.util.List;
/**
 * @Description TODO
 * @date 2022/7/12 22:52
 * @created by zhushuxian
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
