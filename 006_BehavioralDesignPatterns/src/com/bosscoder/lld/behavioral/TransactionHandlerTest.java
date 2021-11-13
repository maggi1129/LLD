package com.bosscoder.lld.behavioral;

public class TransactionHandlerTest {

    public static void main(String[] args) {
        TransactionHandler handler = new TransactionHandler();
        Transaction transaction = new Transaction();
        Command commit = new CommitCommand(transaction);
        Command rollback = new RollbackCommand(transaction);

        //commit
        handler.setCommand(commit);
        handler.executeCommand();

        //rollback
        handler.setCommand(rollback);
        handler.executeCommand();
    }
}
