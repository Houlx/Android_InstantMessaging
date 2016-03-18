package com.hou.android_instantmessaging.toolClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.hou.android_instantmessaging.R;
import com.hou.android_instantmessaging.toolClass.Friend;

import java.util.List;

/**
 * Created by 凌霄 on 2016/3/18.
 */
public class FriendAdapter extends ArrayAdapter<Friend> {
    private int resourceId;

    public FriendAdapter(Context context,int textViewResourceId,List<Friend> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        Friend friend = getItem(position);
        View view;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        }else{
            view = convertView;
        }

        TextView friendName = (TextView)view.findViewById(R.id.friend_name);
        friendName.setText(friend.getName());
        return view;
    }
}
