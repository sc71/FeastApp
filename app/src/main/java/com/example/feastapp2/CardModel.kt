package com.example.feastapp2

class CardModel (private var course_name: String, private var progress: String, private var course_image: Int) {
    fun getCourseName(): String {
        return course_name
    }
    fun setCourseName(courseName: String){
        this.course_name = courseName
    }
    fun getProgress(): String{
        return progress
    }
    fun setProgress(progress: String){
        this.progress = progress
    }
    fun getImage(): Int {
        return course_image
    }
    fun setImage(courseImage: Int){
        this.course_image = courseImage
    }
}