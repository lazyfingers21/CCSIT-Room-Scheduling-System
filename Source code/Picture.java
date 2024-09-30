/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Picture {
    private int num;
    private byte[] picture;
    
        
        public Picture(int num, byte[] picture)
        {
            this.num = num;
            this.picture = picture;    
            
        }
        public int getnum(){
            return num;
        }
        public byte[] getpicture(){
            return picture;
        }
}
