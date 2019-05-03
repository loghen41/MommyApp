/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.hello;

/**
 *
 * @author Hendricks
 */
public class Greeting {
    private final long id;
    private final String name;
    
    public Greeting(long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public long getId() {
        return id;
    }
    
    public String getContent() {
        return name;
    }
}
