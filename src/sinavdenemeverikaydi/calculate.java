/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sinavdenemeverikaydi;

/**
 *
 * @author BLUE
 */
public class calculate {
   double dog;
   double yan;
   //Integer net;
    calculate(){
    }
    public void setNet(double dog,double yan){
        if(dog==0){
            this.dog=0;
        } else {
            this.dog=dog;
        }
    if(yan==0){
        this.yan=0;
    } else {
        this.yan=yan/4;
    }
    }
    public double getNet(){   
        return dog-yan;
    
    }
}
