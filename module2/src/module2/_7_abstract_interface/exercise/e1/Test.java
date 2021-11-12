package module2._7_abstract_interface.exercise.e1;

public class Test {
    public static void main(String[] args) {
        IResizeable[] resizeable=new IResizeable[3];
        resizeable[0]=new Circle(4);
        resizeable[1]=new Rectangle(2,6,"blue",false);
        resizeable[2]=new Square(4,"red",false);
        for (IResizeable result:resizeable){
            if (result instanceof  Circle){
                System.out.println(result);
                result.resize(50);
                System.out.println(result);
            }else if (result instanceof Rectangle){
                System.out.println(result);
                result.resize(50);
                System.out.println(result);
            }else {
                System.out.println(result);
                result.resize(100);
                System.out.println(result);
            }
        }
    }
}
