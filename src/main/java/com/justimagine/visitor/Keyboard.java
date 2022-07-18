package com.justimagine.visitor;

/**
 * @Description TODO
 * @Date 2022/7/18 14:49
 * @Created by zhushuxian
 */
public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
