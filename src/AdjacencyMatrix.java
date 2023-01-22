public class AdjacencyMatrix {
    int [][] adjMatrix;
    public AdjacencyMatrix(int nodes)
    {
        this.adjMatrix=new int[nodes][nodes];
    }
    public void addEdge(int u,int v)
    {
     adjMatrix[u][v]=1;
     adjMatrix[v][u]=1;
    }

    public static void main(String[] args) {
        AdjacencyMatrix am=new AdjacencyMatrix(4);
        am.addEdge(0,1);
        am.addEdge(1,2);
        am.addEdge(2,3);
        am.addEdge(3,0);
        System.out.println(am);
    }
}
