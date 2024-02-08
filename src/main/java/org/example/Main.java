package org.example;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void out(String s) {
        System.out.println(s);
    }

    public static void out(int i) {
        System.out.println(i);
    }

    public static void out(Integer iObj) {
        System.out.println("Integer =" + iObj);

    }

    public static void out(char c) {
        System.out.println(c);
    }

    public static void out(Class aClass) {
        System.out.println(aClass);
    }


    public static void main(String[] args) {
        out("hej");
        out(5);
        out("hej".indexOf('e'));
        //parse.Int tager en streng og forsøger at lave om til tal, hvor man angiver hvilket talsystem.
        out(Integer.parseInt("ff", 16));
        out(Integer.valueOf("10", 16));

        Integer myInteger = 5;
        out(myInteger);

// finder ASCII værdien
        out('a');
        out("你好");

        for (int i = 36890; i < 36900; i++) {
            out("Kinsesisk tegn " + (char) +i + i);
        }

        char h = 'ح';
        out((int) h);
        out((char) 1581
        );
        var obj ="hej".getClass();
        out(obj);

    }
};