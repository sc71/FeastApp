import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.feastapp2.NewsModel
import com.example.feastapp2.R

class NewsAdapter(newsModelArrayList: ArrayList<NewsModel>) :
    RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    private val newsModelArrayList: ArrayList<NewsModel>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.ViewHolder {
        // to inflate the layout for each item of recycler view.
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.post_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsAdapter.ViewHolder, position: Int) {
        // to set data to textview and imageview of each card layout
        val model: NewsModel = newsModelArrayList[position]
        holder.postContent.text = model.getNews()
        holder.numLikes.text = model.getLikes().toString()
        holder.userImage.setImageResource(model.getProfile())
    }

    override fun getItemCount(): Int {
        // this method is used for showing number of card items in recycler view.
        return newsModelArrayList.size
    }

    // View holder class for initializing of your views such as TextView and Imageview.
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userImage: ImageView
        val postContent: TextView
        val numLikes: TextView
        init {
            postContent = itemView.findViewById(R.id.post_content)
            numLikes = itemView.findViewById(R.id.num_likes)
            userImage = itemView.findViewById(R.id.user_img)
        }
    }

    // Constructor
    init {
        this.newsModelArrayList = newsModelArrayList
    }
}
