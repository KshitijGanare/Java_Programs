package collection_Framework.Map;
import java.util.HashMap;
import java.util.Map;

public class TraversalDemo {

    Map<Integer, String> mapEx = new HashMap<>();

    public static void main(String[] args) {

       TraversalDemo td = new TraversalDemo();
       td.returnKey();

    }

    void returnKey(){

        mapEx.put(10, "Ten");
        mapEx.put(20, "Twenty");
        mapEx.put(30, "Thirty");
        mapEx.put(40, "Fourty");
        mapEx.put(50, "Fifty");
        mapEx.put(null, null);


        for (Map.Entry<Integer, String > e: mapEx.entrySet()){

            if (e.getKey() == null){
                continue;
            }

            if(e.getKey() >= 0){
                System.out.println(e.getKey() + "-->" +e.getValue());
            }

        }


    }


}
