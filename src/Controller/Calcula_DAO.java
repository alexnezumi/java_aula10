
package Controller;


import static View.CalculadoraIMC_GUI.resp_txt;
import static View.CalculadoraIMC_GUI.img1_img;
import static View.CalculadoraIMC_GUI.img2_img;
import static View.CalculadoraIMC_GUI.img3_img;
import static View.CalculadoraIMC_GUI.img4_img;
import static View.CalculadoraIMC_GUI.img5_img;
import static View.CalculadoraIMC_GUI.alt_txt;
import static View.CalculadoraIMC_GUI.peso_txt;



public class Calcula_DAO {
    
    public static double alt = 0, peso =0, resp =0;
    public static void calculo (){
   
    alt = Double.parseDouble(alt_txt.getText());
    peso = Double.parseDouble(peso_txt.getText());
    
    resp = peso /(alt * alt );
    
    if(resp <= 18.5){
    img1_img.setVisible(true);
    resp_txt.setVisible(true);
    resp_txt.setText(String.valueOf(resp));
    
    }if(resp >= 18.6 && resp <= 24.9){
    
    img2_img.setVisible(true);
    resp_txt.setVisible(true);
    resp_txt.setText(String.valueOf(resp));
    }if(resp >= 25 && resp <= 29.9){
    
    img3_img.setVisible(true);    
    resp_txt.setVisible(true);
    resp_txt.setText(String.valueOf(resp));
    }if(resp >= 30 && resp <= 39.9){
     
    img4_img.setVisible(true);    
    resp_txt.setVisible(true);
    resp_txt.setText(String.valueOf(resp));
    }if(resp >= 40 ){
    
    img5_img.setVisible(true);  
    resp_txt.setVisible(true);
    resp_txt.setText(String.valueOf(resp));
    }
    }
    
     public static void limpar(){
        alt_txt.setText("");
        peso_txt.setText("");
        resp_txt.setText("");
         img1_img.setVisible(false); 
         img2_img.setVisible(false);  
         img3_img.setVisible(false);  
         img4_img.setVisible(false);  
         img5_img.setVisible(false);  
        
     }
}
