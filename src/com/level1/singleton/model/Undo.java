package com.level1.singleton.model;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;
    private List<String> history;

    private Undo(){
        history = new ArrayList<>();
    }

    public synchronized static Undo getInstance(){
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public List<String> getHistory(){
        return history;
    }
}
