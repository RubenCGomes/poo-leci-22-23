package aula09.ex01;

import java.util.*;

import aula05.DateYMD;
import aula06.ex01.Pessoa;
import aula07.ex02.Date;
import aula07.ex02.DateND;

public class ALDemo {
    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        for (int i = 10; i <= 100; i+=10)
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for (int i = 0; i < c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);

        c2.add("Calor");
        System.out.println(c1.contains(20));
        System.out.println(c2.indexOf("Chuva"));
        System.out.println(c1.lastIndexOf(80));
        c1.set(9, 110);
        System.out.println(c1.subList(5, 10));

        Set <Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("Jervazio", 55412654, new DateYMD(25,4,2007)));
        c3.add(new Pessoa("Antonia", 65789214, new DateYMD(27,2,1958)));
        c3.add(new Pessoa("Candido Faisca", 41235478, new DateYMD(14,9,1947)));
        c3.add(new Pessoa("Ze", 87542136, new DateYMD(8,6,1958)));
        c3.add(new Pessoa("Quim", 65412398, new DateYMD(2,7,1965)));

        for (Pessoa pessoa : c3) {
            System.out.println(pessoa);
        }

        System.out.println();

        c3.add(new Pessoa("Jervazio", 55412654, new aula05.DateYMD(25,4,2007)));

        for (Pessoa pessoa: c3) {
            System.out.println(pessoa);
        }

        Set<Date> c4 = new TreeSet<>();

        c4.add(new aula07.ex02.DateYMD(25, 8, 2004));
        c4.add(new DateND(800));
        c4.add(new DateND(3000));
        c4.add(new aula07.ex02.DateYMD(11, 7, 2010));
        c4.add(new DateND(1500));
        c4.add(new aula07.ex02.DateYMD(14, 2, 2020));

        for (Date date : c4) {
            System.out.println(date);
        }
    }
}
