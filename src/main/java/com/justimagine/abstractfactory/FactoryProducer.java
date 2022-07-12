package com.justimagine.abstractfactory;

/**
 * @Description TODO
 * @Date 2022/7/12 12:47
 * @Created by zhushuxian
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}