import java.util.ArrayList;

public class Generic{
    public static void main(String[] args){
        Box<String> kutu1 = new Box<>();
        Box<Integer> kutu2 = new Box<>();
        kutu2.setValue(null);
        ArrayList<Integer> liste1 = new ArrayList<>();
        ArrayList<Integer[]> liste2 = new ArrayList<>();
        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        liste1.add(1);
        System.out.println(liste1.get(0));
        liste2.add(array);
        System.out.println(liste2);
    }
}

class Box<T>{
    private T value;

    public Box(){}

    public Box(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
} 

    
