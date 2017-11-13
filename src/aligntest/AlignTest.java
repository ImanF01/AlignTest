/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aligntest;

/**
 * Ex 12.8
 * 
 * Iman Fahmy
 * 11/10/17
 */
import javax.swing.JFrame;

public class AlignTest {
    
    public static void main(String[] args) 
    {
        Align alignFrame = new Align();
        alignFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        alignFrame.setSize(300, 150);
        alignFrame.setVisible(true);
    }
    
}
