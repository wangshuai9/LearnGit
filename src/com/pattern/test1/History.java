package com.pattern.test1;

import java.util.Stack;

public class History {
    Stack<Backup> backupStack = new Stack<Backup>();

    public void add(Backup backup){
        backupStack.add(backup);
    }

    public Backup getLastVersion(){
        return backupStack.pop();
    }
}
