package com.example.basegradle.test;

/**
 * 抽象类，定义模板方法和基本方法
 */
abstract class abstractClass{
    /**
     * 具体方法,声明并实现，继承此抽象类不需实现此方法
     */
    public void concreteMethod(){
        System.out.print("这是一个具体方法");
    }

    /**
     * 抽象方法，abstract关键字标识，只声明，并不实现，继承此抽象类必须实现此方法
     */
    protected abstract void abstractMethod();

    /**
     * 钩子方法，声明并实现（空实现或者定义相关内容皆可），继承此抽象类的子类可扩展实现或者不实现
     */
    public void hookMethod(){
        //可定义一个默认操作，或者为空
        //System.out.print("此钩子方法有个默认操作")
    };

    /**
     * 模板方法，整个算法的骨架
     */
    public void templateMethod(){
        abstractMethod();
        concreteMethod();
        hookMethod();
    }
}

class childClass1 extends abstractClass{
    @Override
    protected void abstractMethod(){
        System.out.print("子类实现父类抽象类中的抽象方法");
    }

    /**
     * 重构钩子方法
     */
    //public void hookMethod(){
    // System.out.print("子类可以在父类钩子方法实现的基础上进行扩展");
    //}
}

class childClass2 {
    public void bond(abstractClass abstractClass){
        abstractClass.templateMethod();
    }
}

class Test{
    public static void main(String[] args) {
        childClass2 childClass2=new childClass2();
        childClass2.bond(new abstractClass(){
            //匿名内部类实现回调
            @Override protected void abstractMethod(){
                System.out.print("子类实现父类抽象类中的抽象方法");
            }
            /**
             * 重构钩子方法
             */
            //public void hookMethod(){
            // System.out.print("子类可以在父类钩子方法实现的基础上进行扩展");
            //}
        });
    }
}