package aula06.exer2;

import java.util.Vector;

public class Conjunto {

    private Vector<Integer> vector = new Vector<>();
    
    public void insert(int n) {
        if (!this.contains(n)) vector.add(n);
    }

    public boolean contains(int n) {
        return vector.contains(n);
    }

    public void remove(int n) {
        if (this.contains(n)) {
            int index = vector.indexOf(n);
            vector.remove(index);
        }
    }

    public void empty() {
        vector.clear();
    }

    public int size() {
        return vector.size();
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < vector.size(); i++) {
            s += vector.get(i) + " ";
        }
        return s;
    }

    public Conjunto combine(Conjunto c) {
        Conjunto result = new Conjunto();
        for (int i = 0; i < this.size(); i++) {
            result.insert(this.vector.get(i));
        }
        for (int i = 0; i < c.size(); i++) {
            result.insert(c.vector.get(i));
        }
        return result;
    }

    public Conjunto subtract(Conjunto diff) {
        Conjunto result = new Conjunto();
        for (int i = 0; i < this.size(); i++) {
            if (!diff.contains(this.vector.get(i)))
                result.insert(this.vector.get(i));
        }
        return result;
    }

    public Conjunto intersect(Conjunto inter) {
        Conjunto result = new Conjunto();
        for (int i = 0; i < this.size(); i++) {
            if (inter.contains(this.vector.get(i)))
                result.insert(this.vector.get(i));
        }
        return result;
    }
    
}
