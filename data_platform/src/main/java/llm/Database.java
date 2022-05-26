package llm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    public static List<Car> cars = new ArrayList<Car>(Arrays.asList(
            new Car("0", "Toyota", "DMB-08Q", "CAMRY"),
            new Car("1", "Tesla", "MWQ-0A7", "Model-Y")
    ));
    /*public static Car[] cars = {
            new Car("0", "Toyota", "DMB-08Q", "CAMRY"),
            new Car("1", "Tesla", "MWQ-0A7", "Model-Y")
    };*/

    public static int[][] graph = {{1, 2}, {2,3}, {3},{4}, {}};
}
