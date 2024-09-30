/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
class Course {
    private String coursenum, title;
        
        public Course(String coursenum, String title)
        {
            this.coursenum = coursenum;
            this.title = title;      
        }
        public String getcoursenum(){
            return coursenum;
        }
        public String gettitle(){
            return title;
        }
}
