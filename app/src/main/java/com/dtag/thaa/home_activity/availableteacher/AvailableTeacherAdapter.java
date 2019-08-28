package com.dtag.thaa.home_activity.availableteacher;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.recyclerview.widget.RecyclerView;

import com.dtag.thaa.DrawerModel;
import com.dtag.thaa.GlideApp;
import com.dtag.thaa.Onclicklistenerd;
import com.dtag.thaa.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AvailableTeacherAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    List<AvailableTeacherModuleData> groupData;
    private Onclicklistenerd onclicklistener;
    Context context;
    boolean checkd=false;
    int posi=200;
   // private SetShapeD setShapeD;




    public AvailableTeacherAdapter(Context context, List<AvailableTeacherModuleData> groupData, Onclicklistenerd onclicklistener ) {
        this.groupData = groupData;
        this.onclicklistener = onclicklistener;
        this.context = context;
      //  setShapeD= ((HomeAcitivity)context).setShapeD=this;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_available, viewGroup, false);
        return new GroupViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder viewHolder, int i) {
        AvailableTeacherModuleData groupData1=  groupData.get(i);
        // ((GroupViewHolder) viewHolder).unread_message.setText(""+groupData1.getNumber_unread_message());




        ((GroupViewHolder) viewHolder).teacherName.setText(groupData1.getName());

        ((GroupViewHolder) viewHolder).detailsName.setText(groupData1.getName());

        ((GroupViewHolder) viewHolder).rateBar.setRating(groupData1.getContentrate());




        GlideApp.with(context)
                .load(groupData1.getImageUrl())
                .placeholder(R.drawable.empty_user)
                .into(((GroupViewHolder) viewHolder).profileImage);


//        ((GroupViewHolder) viewHolder).searchIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        ((GroupViewHolder) viewHolder).rateBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                //  rateing= rateing;

                //rateing = (int) rating;
                // Log.w("TAG", rateing + "......");


            }
        });


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

        CircleImageView profileImage ;
        ImageView  searchIcon;
        TextView teacherName ,detailsName;
        AppCompatRatingBar rateBar;




        public GroupViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            teacherName=(TextView)itemView.findViewById(R.id.name_id);
            detailsName=(TextView)itemView.findViewById(R.id.details_id);
            rateBar=(AppCompatRatingBar) itemView.findViewById(R.id.rate_id);
            profileImage=(CircleImageView)itemView.findViewById(R.id.profile_image);


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
