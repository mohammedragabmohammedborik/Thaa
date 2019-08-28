package com.dtag.thaa.home_activity.chat;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.recyclerview.widget.RecyclerView;

import com.dtag.thaa.GlideApp;
import com.dtag.thaa.Onclicklistenerd;
import com.dtag.thaa.R;
import com.dtag.thaa.home_activity.availableteacher.AvailableTeacherModuleData;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    List<ChatMessage> groupData;
    private Onclicklistenerd onclicklistener;
    Context context;
    boolean checkd=false;
    int posi=200;
   // private SetShapeD setShapeD;




    public ChatAdapter(Context context, List<ChatMessage> groupData, Onclicklistenerd onclicklistener ) {
        this.groupData = groupData;
        this.onclicklistener = onclicklistener;
        this.context = context;
      //  setShapeD= ((HomeAcitivity)context).setShapeD=this;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.layout_text_chat, viewGroup, false);
        return new ViewHolderText(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder viewHolder, int i) {
        int gravity = Gravity.RIGHT;


        ChatMessage chatMessage = groupData.get(i);
        // ((GroupViewHolder) viewHolder).unread_message.setText(""+groupData1.getNumber_unread_message());

        if (!chatMessage.getMtype().equals("member")) {
            gravity = Gravity.LEFT;
            ((ViewHolderText) viewHolder).textChat.setText(chatMessage.getMaintext());
            ((ViewHolderText) viewHolder).nickName.setText("الادمن");
            ((ViewHolderText) viewHolder).textTime.setText(chatMessage.getMessage_time());
            //((ViewHolderText) viewHolder).textChat.setTextColor(context.getResources().getColor(R.color.black_color));

            ((ViewHolderText) viewHolder).linimg.setBackgroundResource(R.drawable.leftb);

            ((ViewHolderText) viewHolder).textChat.setTextColor(context.getResources().getColor(R.color.colorPrimaryDark));


        }else {
            ((ViewHolderText) viewHolder).textChat.setText(chatMessage.getMaintext());
            ((ViewHolderText) viewHolder).nickName.setText("انت");
            ((ViewHolderText) viewHolder).textTime.setText(chatMessage.getMessage_time());
            //((ViewHolderText) viewHolder).textChat.setTextColor(context.getResources().getColor(R.color.black_color));

            ((ViewHolderText) viewHolder).linimg.setBackgroundResource(R.drawable.rightb);

            ((ViewHolderText) viewHolder).textChat.setTextColor(context.getResources().getColor(R.color.white_color));

        }

        LinearLayout.LayoutParams params3 = ( new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.FILL_PARENT));

       // ((ViewHolderText) viewHolder).textChat.setBackgroundColor(color);
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams)((ViewHolderText) viewHolder).textChat.getLayoutParams();
        LinearLayout.LayoutParams params1t = (LinearLayout.LayoutParams)((ViewHolderText) viewHolder).nickName.getLayoutParams();
        LinearLayout.LayoutParams params2t = (LinearLayout.LayoutParams)((ViewHolderText) viewHolder).textTime.getLayoutParams();
        params.gravity = gravity;
        params1t.gravity = gravity;
        params2t.gravity = gravity;
        params3.gravity=gravity;

        ((ViewHolderText) viewHolder).textChat.setLayoutParams(params);
        ((ViewHolderText) viewHolder).nickName.setLayoutParams(params1t);
        ((ViewHolderText) viewHolder).textTime.setLayoutParams(params2t);

        ((ViewHolderText) viewHolder).linimg.setLayoutParams(params3);



//            ((GroupViewHolder) viewHolder).teacherName.setText(groupData1.getName());
//
//            ((GroupViewHolder) viewHolder).detailsName.setText(groupData1.getName());
//
//            ((GroupViewHolder) viewHolder).rateBar.setRating(groupData1.getContentrate());


//            GlideApp.with(context)
//                    .load(groupData1.getImageUrl())
//                    .placeholder(R.drawable.empty_user)
//                    .into(((GroupViewHolder) viewHolder).profileImage);


//        ((GroupViewHolder) viewHolder).searchIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

//            ((GroupViewHolder) viewHolder).rateBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
//                @Override
//                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
//
//                    //  rateing= rateing;
//
//                    //rateing = (int) rating;
//                    // Log.w("TAG", rateing + "......");
//
//
//                }
//            });


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




    private class ViewHolderText extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textChat ,nickName ,textTime;
        LinearLayout linimg;


        public ViewHolderText(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            textChat=itemView.findViewById(R.id.txtMessage);
            nickName=itemView.findViewById(R.id.nike_name_chat);
            textTime=itemView.findViewById(R.id.tex_message_time);
            linimg=itemView.findViewById(R.id.linimg);


        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            // mOnClickListener.onListItemClick(clickedPosition);
        }
    }


    private int fetchColor(int color) {
        TypedValue typedValue = new TypedValue();
        TypedArray a = context.obtainStyledAttributes(typedValue.data,
                new int[] { color });
        int returnColor = a.getColor(0, 0);
        a.recycle();
        return returnColor;
    }


}
