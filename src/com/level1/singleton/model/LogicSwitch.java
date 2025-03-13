package com.level1.singleton.model;

import com.level1.singleton.entities.Undo;

public class LogicSwitch {

    private Undo undo = Undo.getInstance();

    public void addCommand(String command){
        undo.getHistory().add(command);
    }

    public void deleteCommand(){
        if(!undo.getHistory().isEmpty()){
            undo.getHistory().remove(undo.getHistory().size() - 1);
        }else{
            System.out.println("No hay comandos para eliminar.");
        }
    }

    public void listCommand(){
        if(undo.getHistory().isEmpty()){
            System.out.println("No hay comandos en el historial");
        }else{
            System.out.println("Historial de comandos");
            for(String cmd : undo.getHistory()){
                System.out.println(cmd);
            }
        }
    }
}
