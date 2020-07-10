/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hargi
 */
public class Dealer {  
    private CarDealer Toyota;  
    private CarDealer Daihatsu;  
    private CarDealer Suzuki;  
      
    public Dealer(){  
        Toyota = new Toyota();  
        Daihatsu = new Daihatsu();  
        Suzuki = new Suzuki();  
    }  
    public void ToyotaSale(){  
        Toyota.model();  
        Toyota.price();  
    }  
    public void DaihatsuSale(){  
        Daihatsu.model();  
        Daihatsu.price();  
    }  
    public void SuzukiSale(){  
        Suzuki.model();  
        Suzuki.price();  
        }  
}  

