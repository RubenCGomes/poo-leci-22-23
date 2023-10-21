package aula06.ex03;

import java.util.Arrays;

public class Conjunto {
    private int [] conjunto = new int[0];

    public void insert(int n){
        if (contains(n)) return;
        this.conjunto = Arrays.copyOf(this.conjunto, this.conjunto.length + 1);
        this.conjunto[this.conjunto.length - 1] = n;
    }

    public boolean contains(int n){
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i] == n) return true;
        }
        return false;
    }

    public void remove(int n){
        if (contains(n)){
            int[] arr = new int[this.conjunto.length - 1];
            for (int i = 0, j = 0; i < this.conjunto.length; i++) {
                if (this.conjunto[i] != n){
                    arr[j] = this.conjunto[i];
                    j++;
                }
            }
            this.conjunto = arr;
        }
    }

    public void empty() {this.conjunto = new int[0];}

    public String toString(){
        String str = "";
        for (int j : this.conjunto) {
            str += j + " ";
        }
        return str;
    }

    public int size() {return this.conjunto.length;}

    public Conjunto combine(Conjunto add){
        Conjunto arr = new Conjunto();
        for (int i = 0; i < conjunto.length; i++) {
            arr.insert(conjunto[i]);
        }

        for (int i = 0; i < add.size(); i++) {
            arr.insert(add.conjunto[i]);
        }
        return arr;
    }

    public Conjunto subtract(Conjunto dif){
        Conjunto arr = new Conjunto();
        for (int i = 0; i < conjunto.length; i++) {
            arr.insert(conjunto[i]);
        }

        for (int i = 0; i < dif.size(); i++) {
            arr.remove(dif.conjunto[i]);
        }
        return arr;
    }

    public Conjunto intersect(Conjunto inter){
        Conjunto arr = new Conjunto();
        for (int i = 0; i < size(); i++) {
            for (int j = 0; j < inter.size(); j++) {
                if (inter.conjunto[j] == conjunto[i]) arr.insert(conjunto[i]);
            }
        }
        return arr;
    }
}
