package it.quagliano.massacorporea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Valentina
 */
public class IMC {
    
    private double peso;
    private double altezza;
    
    public IMC()
    {

    }
    
    public double calcola(double peso, double altezza)
    {
        double IMC= ( (peso) / ( (altezza/100) * (altezza/100) )  );
        return IMC;
    }
    
    
}
