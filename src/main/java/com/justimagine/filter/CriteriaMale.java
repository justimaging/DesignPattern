package com.justimagine.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @date 2022/7/12 22:51
 * @created by zhushuxian
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
