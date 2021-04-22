/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funfilecreator;

/**
 *
 * @author User
 */
public class FunFileLibrary {
    String Hr;
    //hr : Border Horizontal for Style
    FunFileLibrary(String Hr){
        this.Hr = Hr;
    }
    
    public void hr(String Hr){
        System.out.println("");
        for (int i=0; i<20; i++){
            System.out.print(Hr);
        }
        System.out.println("");
    }
    
}
