import java.util.ArrayList;

public class ListOfExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        int i;

        for(i = 0; i < myList.size(); i++) {
            try {
            Integer castedValue = (Integer) myList.get(i);
        }catch(ClassCastException e){
                System.out.println(e + " The error index is " + myList.get(i));

            }
        }
        }


    }
