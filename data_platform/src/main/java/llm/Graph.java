package llm;


import java.util.List;

public class Graph {
    private int length;
    private List<List<Integer>> allPaths;

    public Graph(int length, List<List<Integer>> allPaths) {
        this.length = length;
        this.allPaths = allPaths;
    }

    public int getLength() {
        return length;
    }
    public List<List<Integer>> getAllPaths() {
        return allPaths;
    }


}
