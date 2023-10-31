/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.DTO;

public class ConsumoDTO {
   private double kmini; 
   private double kmifim; 
   private double litros; 

    public double getKmini() {
        return kmini;
    }

    public void setKmini(double kmini) {
        this.kmini = kmini;
    }

    public double getKmifim() {
        return kmifim;
    }

    public void setKmifim(double kmifim) {
        this.kmifim = kmifim;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
   public double consumoMedia(){
     return (this.kmifim-this.kmini)/this.litros; 
   }
}
