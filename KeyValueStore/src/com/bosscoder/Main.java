package com.bosscoder;

public class Main {

    public static void main(String[] args) {
        KeyValueService<String, String> pair= new KeyValueService<>("name","Megha");
        String key = pair.getKey();
        String value = pair.getValue();
        System.out.println("{"+key+":"+value+"}");
    }
}
