package com.dtag.thaa;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dtag.thaa.home_activity.HomeAcitivity;

import java.util.List;

public class DrawerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    List<DrawerModel> groupData;
    private Onclicklistenerd onclicklistener;
    Context context;
    boolean checkd=false;
    int posi=200;
   // private SetShapeD setShapeD;




    public DrawerAdapter(Context context, List<DrawerModel> groupData, Onclicklistenerd onclicklistener ) {
        this.groupData = groupData;
        this.onclicklistener = onclicklistener;
        this.context = context;
      //  setShapeD= ((HomeAcitivity)context).setShapeD=this;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_drawer, viewGroup, false);
        return new GroupViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder viewHolder, int i) {
        DrawerModel groupData1=  groupData.get(i);
        // ((GroupViewHolder) viewHolder).unread_message.setText(""+groupData1.getNumber_unread_message());




        ((GroupViewHolder) viewHolder).icon_name.setText(groupData1.getTextIcon());
        Log.w("TAG",""+checkd);

//        if(checkd) {
//            ((GroupViewHolder) viewHolder).frameLayout.setBackground(context.getDrawable(R.drawable.drawer_shape));
//            checkd=false;
//        }else {
//            ((GroupViewHolder) viewHolder).frameLayout.setBackgroundColor(Color.TRANSPARENT);
//            checkd=true;
//
//        }

        Log.w("ADApter",groupData1.getTextIcon());

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















//        if(checkd){
//            ((GroupViewHolder) viewHolder).icon_name.setTextColor(context.getResources().getColor(R.color.button_text));
//            ((GroupViewHolder) viewHolder).image_icon.setColorFilter(ContextCompat.getColor(context, R.color.button_text), android.graphics.PorterDuff.Mode.MULTIPLY);
//
//            ((GroupViewHolder) viewHolder).rowicon.setColorFilter(ContextCompat.getColor(context, R.color.button_text), android.graphics.PorterDuff.Mode.MULTIPLY);
//            }else {
//
//            ((GroupViewHolder) viewHolder).icon_name.setTextColor(context.getResources().getColor(R.color.change_icon_color));
//            ((GroupViewHolder) viewHolder).image_icon.setColorFilter(ContextCompat.getColor(context, R.color.change_icon_color), android.graphics.PorterDuff.Mode.MULTIPLY);
//
//            ((GroupViewHolder) viewHolder).rowicon.setColorFilter(ContextCompat.getColor(context, R.color.change_icon_color), android.graphics.PorterDuff.Mode.MULTIPLY);
//
//        }
//

    }

    @Override
    public int getItemCount() {
        return groupData.size();
    }




    public   class  GroupViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView image_icon , rowicon;
        TextView icon_name ;
        FrameLayout frameLayout;




        public GroupViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            icon_name=(TextView)itemView.findViewById(R.id.textdrawer);
            frameLayout=(FrameLayout) itemView.findViewById(R.id.frames);

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
