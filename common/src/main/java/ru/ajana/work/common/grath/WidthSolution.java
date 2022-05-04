package ru.ajana.work.common.grath;

/**
 * Его суть в том, что у нас есть некоторая текущая вершина, с которой мы все смежные, непройденные
 * вершины, заносим в очередь и выбираем следующий элемент (который хранится первым в очереди),
 * чтобы его сделать текущим…
 *
 * <p>Класс графа практически идентичен аналогичному классу из алгоритма поиска в глубину, за
 * исключением метода, обрабатывающего алгоритм и замены внутреннего стека на очередь
 *
 * <p>Сложность: O(N²)
 */
public class WidthSolution {
  public static void main(String[] args) {
    WidthGraph graph = new WidthGraph();
    graph.addVertex('A'); // 0
    graph.addVertex('B'); // 1
    graph.addVertex('C'); // 2
    graph.addVertex('D'); // 3
    graph.addVertex('E'); // 4
    graph.addVertex('F'); // 5
    graph.addVertex('G'); // 6

    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(0, 3);
    graph.addEdge(1, 4);
    graph.addEdge(3, 5);
    graph.addEdge(5, 6);

    System.out.println("Visits: ");
    graph.bfc();
  }
}
