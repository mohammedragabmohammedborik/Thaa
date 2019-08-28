package com.dtag.thaa.home_activity.teacheractivity.durationfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dtag.thaa.Onclicklistenerd;
import com.dtag.thaa.R;
import com.dtag.thaa.home_activity.teacheractivity.teacher_data.ModuleAdapterCourses;

import java.util.List;

public class AdapterDuration extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    List<ModuleAdapterDuration> groupData;
    private Onclicklistenerd onclicklistener;
    Context context;
    boolean checkd=false;
    int posi=200;
   // private SetShapeD setShapeD;




    public AdapterDuration(Context context, List<ModuleAdapterDuration> groupData, Onclicklistenerd onclicklistener ) {
        this.groupData = groupData;
        this.onclicklistener = onclicklistener;
        this.context = context;
      //  setShapeD= ((HomeAcitivity)context).setShapeD=this;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_period, viewGroup, false);
        return new GroupViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder viewHolder, int i) {
        ModuleAdapterDuration groupData1=  groupData.get(i);
        // ((GroupViewHolder) viewHolder).unread_message.setText(""+groupData1.getNumber_unread_message());




        ((GroupViewHolder) viewHolder).courseName.setText(groupData1.getCourseName());

        ((GroupViewHolder) viewHolder).placename.setText(groupData1.getPlaceOfbirth());

        ((GroupViewHolder) viewHolder).durationName.setText(groupData1.getCourseDuration());

        ((GroupViewHolder) viewHolder).delete.setVisibility(View.GONE);


//        ((GroupViewHolder) viewHolder).delete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

//        GlideApp.with(context)
//                .load(groupData1.getImageUrl())
//                .placeholder(R.drawable.empty_user)
//                .into(((GroupViewHolder) viewHolder).profileImage);


//        ((GroupViewHolder) viewHolder).searchIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

//        ((GroupViewHolder) viewHolder).rateBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
//            @Override
//            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
//
//                //  rateing= rateing;
//
//                //rateing = (int) rating;
//                // Log.w("TAG", rateing + "......");
//
//
//            }
//        });


       // Log.w("TAG",""+checkd);

//        if(checkd) {
//            ((GroupViewHolder) viewHolder).frameLayout.setBackground(context.getDrawable(R.drawable.drawer_shape));
//            checkd=false;
//        }else {
//            ((GroupViewHolder) viewHolder).frameLayout.setBackgroundColor(Color.TRANSPARENT);
//            checkd=true;
//
//        }

       // Log.w("ADApter",groupData1.getTextIcon());

//        if(i==groupData.size()){
//         //   ((GroupViewHolder) viewHolder).viewd.setVisibility(View.GONE);
//
//        }else {
//          //  ((GroupViewHolder) viewHolder).viewd.setVisibility(View.VISIBLE);
//
//        }


//        GlideApp.with(context)
//                .load(groupData1.getImageIcon())
//
//                .into(((GroupViewHolder) viewHolder).image_icon);

        //  if(checkd!)
















    }

    @Override
    public int getItemCount() {
        return groupData.size();
    }




    public   class  GroupViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView  delete;
        TextView courseName ,placename,durationName;




        public GroupViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            courseName=(TextView)itemView.findViewById(R.id.course_name);
            placename=(TextView)itemView.findViewById(R.id.course_place);
            durationName=(TextView)itemView.findViewById(R.id.course_period);

            delete=(ImageView) itemView.findViewById(R.id.delete_course);


           // searchIcon=(ImageView)itemView.findViewById(R.id.)
            // viewd=(View) itemView.findViewById(R.id.vied);





        }

        @Override
        public void onClick(View v) {
            int position =v.getId();
            onclicklistener.onItemClickedListener(getAdapterPosition());

            //notifyDataSetChanged();
//            DrawerAdapter.this.notifyAll();

        }
    }
}
