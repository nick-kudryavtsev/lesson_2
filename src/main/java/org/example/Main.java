package org.example;

import lt.nick.Friend;
import lt.nick.RelationType;

public class Main {
    public static void main(String[] args) {

        Friend John = new Friend(RelationType.FRIEND);
        Friend Steven = new Friend(RelationType.ENEMY);

        John.sayHello(Steven.getRelationType());
    }
}