class Main7 {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
      String[] vertices = {
    "Liberal Arts", 
    "Student Services",
    "Health Careers & Sciences", 
    "Health Technologies Center", 
    "Recreation Center",
    "Technology Learning Center", 
    "Business & Technology", 
    "Theatre"
    };

    // 2-Define Edges
    int[][] edges = {
      {0, 1}, {1, 0},
      {1, 2}, {2, 1},
      {2, 3}, {3, 2},

      {1, 7}, {7, 1},
      {7, 6}, {6, 7},

      {6, 5}, {5, 6},
      {5, 4}, {4, 5},

      {2, 5}, {5, 2}
     };
    // 3. Create the graph (name "graph") using the vertices and edges
    UnweightedGraph<String> graph = new UnweightedGraph<>(vertices, edges);

    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(6);

    // 5. Retrieve and print the search order of the DFS traversal
    System.out.println("DFS Search Order:");
    for (int index : dfs.getSearchOrder()) {
      System.out.println(index + " - " + graph.getVertex(index));
    }

    // 6. Print the parent-child relationships for each vertex during the DFS traversal
    System.out.println("\nDFS Parent-Child Relationships:");
    for (int i = 0; i < graph.getSize(); i++) {
      int parent = dfs.getParent(i);
      if (parent != -1) {
        System.out.println(graph.getVertex(parent) + " -> " + graph.getVertex(i));
      }
    }
    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)
    System.out.println ();
    dfs.printPath(3); // Health Tech Cen
    System.out.println();

    dfs.printPath(1); // Stud Serv
    System.out.println();

    dfs.printPath(4); // Rec Cen
    System.out.println();
     // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
    System.out.println();
    dfs.printTree();
    }
}