package com.justimagine.visitor;

/**
 * @Description TODO
 * @Date 2022/7/18 14:50
 * @Created by zhushuxian
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
