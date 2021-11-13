package com.bosscoder.lld.behavioral;

public class CommitCommand implements Command{
    Transaction transaction;

    public CommitCommand(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void execute() {
        transaction.commit();
    }
}
