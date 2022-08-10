/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author rsd14
 */
public class Ponto {
    private int x,y;
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "Ponto{" + "x=" + x + ", y=" + y +"}";
    }
    
    public Boolean equals(Ponto p2){
        return (p2.y == this.y) & (p2.x == this.x);
}
    
    public double distancia(Ponto p2) {
        return Math.sqrt((p2.y - this.y) *(p2.y - this.y)+(p2.x - this.x)*(p2.x - this.x));
    }
}
