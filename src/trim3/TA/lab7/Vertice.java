package trim3.TA.lab7;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Vadim
 */
class Vertice {
    private final int INF = Integer.MAX_VALUE/2;
    private int number;
    private int pathLength;
    private ArrayList<Integer> path;
    private boolean tagged;
    private javax.swing.JLabel topLabel;
    private javax.swing.JLabel pathLabel;

    public Vertice(int number) {
        this.number = number;
        pathLength = INF;
        path = new ArrayList<>();
        tagged = false;
        this.topLabel = null;
        this.pathLabel = null;
    }

    public void setTopLabel(JLabel topLabel) {
        this.topLabel = topLabel;
    }

    public void setPathLabel(JLabel pathLabel) {
        this.pathLabel = pathLabel;
    }
    
    public void setPathLength(int pathLength) {
        this.pathLength = pathLength;
        pathLabel.setText(String.valueOf(pathLength));
    }

    public void setPath(ArrayList<Integer> path) {
        this.path = path;
    }
    
    public void setTagged(boolean tagged) {
        this.tagged = tagged;
    }
    
    public int getNumber() {
        return number;
    }

    public int getPathLength() {
        return pathLength;
    }

    public ArrayList<Integer> getPath() {
        return path;
    }

    public JLabel getTopLabel() {
        return topLabel;
    }
    
    public boolean isTagged() {
        return tagged;
    }
    
    @Override
    public String toString() {
        return "Vertice=" + number + ", pathLength=" + pathLength + ", path=" + path;
    }

    
}
