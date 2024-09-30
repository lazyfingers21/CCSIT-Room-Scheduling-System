/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
class Sched {
        private String time, mth, w, tf, s;
        
        public Sched(String time, String mth, String w, String tf, String s)
        {
            this.time = time;
            this.mth = mth;
            this.w = w;
            this.tf = tf;    
            this.s = s;
        }
        public String gettime(){
            return time;
        }
        public String getmth(){
            return mth;
        }
        public String getw(){
            return w;
        }
        public String gettf(){
            return tf;
        }
        public String gets(){
            return s;
        }
}
