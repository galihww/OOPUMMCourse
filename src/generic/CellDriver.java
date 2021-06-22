package generic;

public class CellDriver {
    public static void main(String [] args){
        Cell<Integer> integerCell = new Cell<Integer>();
        Cell<String> stringCell = new Cell<String>();
        integerCell.setValue(1);
        stringCell.setValue("one");
        int num = integerCell.getValue();
        String word = stringCell.getValue();
        System.out.println("integer value "+num);
        System.out.println("String value "+word);
    }
}
