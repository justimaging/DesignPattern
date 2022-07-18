package com.justimagine.visitor;

/**
 * @Description TODO
 * @Date 2022/7/14 16:01
 * @Created by zhushuxian
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
