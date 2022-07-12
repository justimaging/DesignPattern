package com.justimagine.filter;

import java.util.List;
/**
 * @Description TODO
 * @date 2022/7/12 22:50
 * @created by zhushuxian
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
