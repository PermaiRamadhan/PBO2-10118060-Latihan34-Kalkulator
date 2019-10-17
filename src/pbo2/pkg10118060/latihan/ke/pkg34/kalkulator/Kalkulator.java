/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg34.kalkulator;

/**
 *
 * @author Permai
 */
class Kalkulator {
     public double value1,value2;
    
    public double tambahBilangan(){
        return (value1+value2);
    }
    public double kurangBilangan(){
        return (value1-value2);
    }
    public double kaliBilangan(){
        return (value1*value2);
    }
    public double bagiBilangan(){
        return (value1/value2);
    }
    public double sisaBilangan(){
        return (Math.floorMod((int)value1, (int)value2));
        
    }
    
}
