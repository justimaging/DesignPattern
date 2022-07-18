package com.justimagine.visitor;

/**
 * @Description TODO
 * @Date 2022/7/18 14:50
 * @Created by zhushuxian
 */
public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
