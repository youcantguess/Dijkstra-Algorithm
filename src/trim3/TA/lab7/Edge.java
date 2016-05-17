package trim3.TA.lab7;

/**
 *
 * @author Vadim
 */
class Edge {
    private int verticeNumber1;
    private int verticeNumber2;
    private int weight;

    public Edge(int vertice1, int vertice2, int weight) {
        this.verticeNumber1 = vertice1;
        this.verticeNumber2 = vertice2;
        this.weight = weight;
    }

    public int getVerticeNumber1() {
        return verticeNumber1;
    }

    public int getVerticeNumber2() {
        return verticeNumber2;
    }
    
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Edge{" + "vertice1=" + verticeNumber1 + ", vertice2=" + verticeNumber2 + ", cost=" + weight + '}';
    }
  
    
    
}
