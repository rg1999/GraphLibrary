package com.Graph;

        import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(new File("C:\\Users\\user\\Desktop\\java\\graph.txt")));
        for(int i=1;i<100000;i++){
            out.write(i+" "+(i+1)+"\n");
        }
        out.flush();
        BufferedReader inp = new BufferedReader(new FileReader(new File("C:\\Users\\user\\Desktop\\java\\graph.txt")));
        Graph<Integer> graph = new Graph<>(true);
        for(int i=1;i<100000;i++){
            String[] s1 = inp.readLine().split(" ");
            graph.addEdge(Long.parseLong(s1[0]),Long.parseLong(s1[1]));
        }
        GraphTraversal g = new GraphTraversal();
        g.DFS(graph);
    }
}
