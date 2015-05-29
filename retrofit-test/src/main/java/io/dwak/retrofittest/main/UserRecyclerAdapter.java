package io.dwak.retrofittest.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import io.dwak.retrofittest.model.User;

public class UserRecyclerAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private Context context;
    private List<User> users;
    private MainAdapterListener mOnItemClickListener;

    public UserRecyclerAdapter(Context context) {
        this.context = context;
        users = new ArrayList<>();
    }

    public void setUsers(List<User> users){
        this.users = users;
        notifyDataSetChanged();
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return UserViewHolder.create(context, parent);
    }

    @Override
    public void onBindViewHolder(UserViewHolder userViewHolder, int i) {
        UserViewHolder.bind(userViewHolder, users.get(i), mOnItemClickListener);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public void setOnItemClickListener(MainAdapterListener onItemClickListener){
        mOnItemClickListener = onItemClickListener;
    }

    public interface MainAdapterListener {
        void onClick(User user);
    }

}
