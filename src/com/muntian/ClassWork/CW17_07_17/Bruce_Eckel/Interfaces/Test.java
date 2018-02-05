package com.muntian.ClassWork.CW17_07_17.Bruce_Eckel.Interfaces;

import java.util.Arrays;

public class Test {
    public static void process(Processor p, Object s) {
        System.out.println("Use Processor" + p.name());
        System.out.println(p.process(s));
    }
    public static String s = "Disagreements with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor {
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

