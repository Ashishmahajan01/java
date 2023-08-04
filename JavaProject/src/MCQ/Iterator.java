package MCQ;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        List names = new ArrayList<>();
        names.add("Eric");
        names.add("Sydney");

        Iterator iterator = names.iterator();

        while (iterator.hasNext()) {
          iterator.remove();
        }
    }

}
