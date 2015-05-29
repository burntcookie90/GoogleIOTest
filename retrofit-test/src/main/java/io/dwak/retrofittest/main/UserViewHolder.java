package io.dwak.retrofittest.main;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.dwak.retrofittest.R;
import io.dwak.retrofittest.databinding.UserViewHolderBinding;
import io.dwak.retrofittest.model.User;

public class UserViewHolder extends RecyclerView.ViewHolder {
    public final UserViewHolderBinding binder;

    public UserViewHolder(View itemView) {
        super(itemView);
        binder = null;
    }
    
    public UserViewHolder(View itemView, UserViewHolderBinding binder){
        super(itemView);

        this.binder = binder;
    }

    public static UserViewHolder create(Context context, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        UserViewHolderBinding binder = DataBindingUtil.inflate(inflater, R.layout.item_user, parent, false);

        return new UserViewHolder(binder.getRoot(), binder);
    }

    public static void bind(UserViewHolder holder, final User user, final UserRecyclerAdapter.MainAdapterListener onItemClickListener){
        holder.binder.contentRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onClick(user);
            }
        });
        holder.binder.setUser(user);
        holder.binder.executePendingBindings();
    }
}
