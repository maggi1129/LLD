package com.bosscoder.lld.behavioral;

public class TransactionHandler {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }
    public void executeCommand(){
        command.execute();
    }
}

