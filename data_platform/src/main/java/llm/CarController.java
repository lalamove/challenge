package llm;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class CarController {
    @GetMapping(value="/cars")
    public List<Car> getCars() {
        /* this is an example */
        return Database.cars;
    }

    @GetMapping(value="/car/{id}")
    public Car getCar(@PathVariable String id) {
        /* you code */
        for(Car car: Database.cars){
            if (car.getId().equals(id))
                return car;
        }
        return null;
    }

    //If the id of the created object already exists, null will be returned, and the create operation will not be performed
    //return the created object
    @PostMapping(value="/car")
    public Car createCar(@RequestBody Car Car) {
        /* you code */
        if (getCar(Car.getId()) == null) {
            Database.cars.add(Car);
            return Car;
        }
        return null;
    }

    //If the id of the created object exists, update it.
    //If not, add it as a new object, which is equivalent to the create operation.
    //return the updated object
    @PutMapping(value="/car")
    public Car updateCar(@RequestBody Car Car) {
        /* you code */
        for (int i = 0; i < Database.cars.size(); i++) {
            Car temp = Database.cars.get(i);
            if (temp.getId() == Car.getId()) {
                Database.cars.set(i, Car);
                return Car;
            }
        }
        Database.cars.add(Car);
        return Car;
    }

    @DeleteMapping(value="/car/{id}")
    public String deleteCar(@PathVariable String id) {
        /* you code */
        Database.cars.removeIf(temp -> temp.getId().equals(id));
        return id;
    }


    HashMap<Integer, Integer> memo = new HashMap<>();
    private int[][] graph = Database.graph;

    @PostMapping(value="/findShortestPath")
    public Graph findShortestPath() {
        /* you code */
        //find the shortest path length
        int shortestLength = findShortestRecursive(0);
        //find all the paths from 0 to n-1 which lengths are equal to the shortest length
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        findAllPathsRecursive(0, shortestLength, currentPath,allPaths);
        Graph graphPath = new Graph(shortestLength,allPaths);
        return graphPath;
    }

    // dp to find the shortest path length
    private int findShortestRecursive(int node){
        if (graph[node] == null) {
            memo.put(node, Integer.MAX_VALUE);
            return memo.get(node);
        }
        for (int neighbor : graph[node]) {
            if (neighbor == graph.length - 1) {
                memo.put(node, 2);
                return memo.get(node);
            }
            if (!memo.containsKey(node)) {
                memo.put(node, findShortestRecursive(neighbor) + 1);
            } else if (memo.get(node) > findShortestRecursive(neighbor) + 1) {
                memo.put(node, findShortestRecursive(neighbor) + 1);
            }
        }
        return memo.get(node);
    }

    private void findAllPathsRecursive(int currentNode, int shortestLength,
                                             List<Integer> currentPath, List<List<Integer>> allPaths) {
        currentPath.add(currentNode);
        //recursion termination condition
        if (currentNode == graph.length - 1 && currentPath.size() == shortestLength) {
            //!!!
            allPaths.add(new ArrayList<>(currentPath));
        }else if (graph[currentNode] != null) {
            for (int neighbor : graph[currentNode]) {
                findAllPathsRecursive(neighbor, shortestLength, currentPath, allPaths);
            }
        }
        //remove the currentNode to backtrack
        currentPath.remove(currentPath.size() - 1);
    }



}
