package Interfaces;

public class Solution4 {
    /*
    Create class Human
    Create interfaces Run, Swim
    Add 1 method to each interface
    Add these interfaces to class Human without method implementation
    Create Human class as abstract
     */
    abstract class Human implements Run_swim {
    }

    interface Run {
        void name();
    }

    interface Swim {
        void name();
    }
}