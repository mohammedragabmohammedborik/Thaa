package com.dtag.thaa.home_activity.teacheractivity.teacherrequests;

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
import com.dtag.thaa.home_activity.teacheractivity.confirm_reserve_student.ConfirmInterface;
import com.rey.material.widget.Button;

import java.util.List;

public class TeacherRequestAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    List<TeacherRequestModuleDataAdapter> groupData;
    private Onclicklistenerd onclicklistener;
    Context context;
    boolean checkd=false;
    int posi=200;

    private ConfirmInterface confirmInterface;

    // private SetShapeD setShapeD;




    public TeacherRequestAdapter(Context context, List<TeacherRequestModuleDataAdapter> groupData, Onclicklistenerd onclicklistener,ConfirmInterface   confirmInterface
    ) {
        this.groupData = groupData;
        this.onclicklistener = onclicklistener;
        this.context = context;
        this.confirmInterface=confirmInterface;
      //  setShapeD= ((HomeAcitivity)context).setShapeD=this;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_teacher_request, viewGroup, false);
        return new GroupViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder viewHolder, int i) {
        TeacherRequestModuleDataAdapter groupData1=  groupData.get(i);
        // ((GroupViewHolder) viewHolder).unread_message.setText(""+groupData1.getNumber_unread_message());




        ((GroupViewHolder) viewHolder).studentName.setText(groupData1.getStudentName());

        ((GroupViewHolder) viewHolder).studentCourse.setText(groupData1.getCourseName());

        ((GroupViewHolder) viewHolder).status.setText(groupData1.getStatus());

        ((GroupViewHolder) viewHolder).accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirmInterface.confirmit(i);


            }
        });


        ((GroupViewHolder) viewHolder).reject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

//        GlideApp.with(context)
//                .load(groupData1.getImageUrl())
//                .placeholder(R.drawable.empty_user)
//                .into(((GroupViewHolder) viewHolder).profileImage);

    }

    @Override
    public int getItemCount() {
        return groupData.size();
    }




    public   class  GroupViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        Button reject,accept;
        TextView studentName ,studentCourse,status;




        public GroupViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            studentCourse=(TextView)itemView.findViewById(R.id.name_course);
            studentName=(TextView)itemView.findViewById(R.id.teacher_name);
            status=(TextView)itemView.findViewById(R.id.status_ofcourse);

            reject=(Button) itemView.findViewById(R.id.reject);
            accept=(Button) itemView.findViewById(R.id.accept);



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
