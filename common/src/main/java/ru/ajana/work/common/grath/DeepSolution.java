package ru.ajana.work.common.grath;

/**
 * Обход графа в глубину.
 *
 * <p>Сложность: O(N²)
 */
public class DeepSolution {
  public static void main(String[] args) {
    DeepGraph deepGraph = new DeepGraph();
    deepGraph.addVertex('A'); // 0
    deepGraph.addVertex('B'); // 1
    deepGraph.addVertex('C'); // 2
    deepGraph.addVertex('D'); // 3
    deepGraph.addVertex('E'); // 4
    deepGraph.addVertex('F'); // 5
    deepGraph.addVertex('G'); // 6

    deepGraph.addEdge(0, 1);
    deepGraph.addEdge(0, 2);
    deepGraph.addEdge(0, 3);
    deepGraph.addEdge(1, 4);
    deepGraph.addEdge(3, 5);
    deepGraph.addEdge(5, 6);

    System.out.println("Visits: ");
    deepGraph.dfs();
  }
}
