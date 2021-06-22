package generic;

public class Cell<T> {
    private T data;

    public void setValue(T cellData){
        data = cellData;
    }

    public T getValue(){
        return data;
    }
}
