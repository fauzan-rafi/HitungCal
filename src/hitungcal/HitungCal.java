/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungcal;

/**
 *
 * @author Windows10
 */
public class HitungCal {

    /**
     * @param args the command line arguments
     */
    
    
    private String makanan;
    private int calorie;
    private int serving;
//   private int limitCalorieUser;
    
    public HitungCal(String makanan,int calorie,int serving){
        this.makanan = makanan;
        this.calorie = calorie;
        this.serving = serving;
    }
    
  
    public int getCalorieMakanan(){
        return this.calorie;
    }
    
    public String getMakanan(){
        return this.makanan;
    }
    
    public int hitungCaloriePerServing(){
        return this.calorie * this.serving;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
