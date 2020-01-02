public class Classes {

    private int primitiveFields;
    private Object objectFields;

    public Classes(){
        primitiveFields = -111;
        objectFields = new Object();
    }

    public static void main(String [] args){
        Classes instance = new Classes();
        instance.doSomething();
        instance.doSomething(-1);
        instance.doSomething(new Object());

        System.out.println(instance.getPrimitiveFields());
        System.out.println(instance.getObjectFields());
    }

    public void doSomething(){
        System.out.println("doSomething 0 attributes");
    }

    public void doSomething(int i){
        System.out.println("doSomething 1 int attribute");
    }

    public void doSomething(Object i){
        System.out.println("doSomething 1 Object attribute");
    }

    public int getPrimitiveFields(){
        return primitiveFields;
    }

    public void setPrimitiveFields(int primitiveFields){
        this.primitiveFields = primitiveFields;
    }

    public Object getObjectFields(){
        return objectFields;
    }

    public void setObjectFields(Object objectFields){
        this.objectFields = objectFields;
    }

}