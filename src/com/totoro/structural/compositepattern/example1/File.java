package com.totoro.structural.compositepattern.example1;

/**
 * @author:totoro
 * @createDate:2022/8/19
 * @description:
 */
public class File extends Component{
    @Override
    public void addComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void test() {
        System.out.println("文件名修改成功"+this);
    }
}
