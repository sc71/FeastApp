import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.feastapp2.CardModel
import com.example.feastapp2.R

class CardAdapter(courseModelArrayList: ArrayList<CardModel>) :
    RecyclerView.Adapter<CardAdapter.ViewHolder>() {
    private val courseModelArrayList: ArrayList<CardModel>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardAdapter.ViewHolder {
        // to inflate the layout for each item of recycler view.
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.cardlayout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardAdapter.ViewHolder, position: Int) {
        // to set data to textview and imageview of each card layout
        val model: CardModel = courseModelArrayList[position]
        holder.courseName.text = model.getCourseName()
        holder.courseProgress.text = model.getProgress()
        holder.courseImg.setImageResource(model.getImage())
    }

    override fun getItemCount(): Int {
        // this method is used for showing number of card items in recycler view.
        return courseModelArrayList.size
    }

    // View holder class for initializing of your views such as TextView and Imageview.
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val courseImg: ImageView
        val courseName: TextView
        val courseProgress: TextView
        init {
            courseName = itemView.findViewById(R.id.course_name)
            courseProgress = itemView.findViewById(R.id.course_progress)
            courseImg = itemView.findViewById(R.id.course_img)
        }
    }

    // Constructor
    init {
        this.courseModelArrayList = courseModelArrayList
    }
}