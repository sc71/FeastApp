package com.example.feastapp2

class NewsModel (private var news: String, private var likes: Int, private var user_profile: Int) {
    fun getNews(): String {
        return news
    }
    fun setNews(courseName: String){
        this.news = news
    }
    fun getLikes(): Int{
        return likes
    }
    fun setLikes(progress: Int){
        this.likes = likes
    }
    fun getProfile(): Int {
        return user_profile
    }
    fun setImage(profileImg: Int){
        this.user_profile = user_profile
    }
}