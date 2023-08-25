package Inheritance.Lab.StackOfStrings_04;

import java.util.ArrayList;

public class StackOfStrings {

    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    //Public method: push(String item): void
    public void push(String item){
        this.data.add(item);
    }

    //Public method: pop(): String
    public String pop(){
        if (this.data.size() != 0) {
            return this.data.remove(this.data.size() - 1);
        }
        return null;
    }

    //Public method: peek(): String
    public String peek(){
        if (this.data.size() != 0){
            return this.data.get(this.data.size() - 1);
        }
        return null;
    }

    //Public method: isEmpty(): boolean
    public boolean isEmpty(){
        if (this.data.isEmpty()){
            return true;
        }
        return false;
    }
}
