/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.excepciones;

/**
 *
 * @author seryi
 */
public class Numero {
    
    float numero;

    public Numero(float numero) {
        this.numero = numero;
    }
    
    public float suma(Numero n){
        
        float suma;
        
        suma = this.numero + n.numero;
        
        return suma;
    }
    
    public float resta(Numero n){
        
        float resta;
        
        resta = this.numero - n.numero;
        
        return resta;
    }
    
    public float multiplica(Numero n){
        
        float multiplicacion;
        
        multiplicacion = this.numero * n.numero;
        
        return multiplicacion;
    }
    
    public float divide(Numero n){
        
        float division;
        
        division = this.numero / n.numero;
        
        return division;
    }
}
