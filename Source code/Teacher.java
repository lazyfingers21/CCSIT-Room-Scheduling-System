/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
class Teacher {
    private String subjects, schedule;
    
        
        public Teacher(String subjects, String schedule)
        {
            this.subjects = subjects;
            this.schedule = schedule;      
            
        }
        public String getsubjects(){
            return subjects;
        }
        public String getschedule(){
            return schedule;
        }

}
