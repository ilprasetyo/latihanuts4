/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11_10116496_latihanuts4;

/**
 *
 * @author Alaba
 */
public class PBO11_10116496_LatihanUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDesigner oMD = new ModelDesigner();
        oMD.bonusDesigner();
        ModelProgrammer oMP = new ModelProgrammer();
        oMP.bonusProgrammer();
        ModelSystemAnalyst oMSA = new ModelSystemAnalyst();
        oMSA.bonusSystemAnalyst();
    }
    
}
