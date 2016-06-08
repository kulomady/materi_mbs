package com.kulomady.pertemuankedua.home;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.kulomady.pertemuankedua.R;

import java.util.List;

/**
 *
 * Created by kulomady on 5/31/16.
 */
public class TaskAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<Task> taskList;


    public TaskAdapter(Context context, List<Task> taskList) {
        this.context = context;
        this.taskList = taskList;

    }

    @Override
    public TaskViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_card, parent, false);
        return new TaskViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int position) {
        final TaskViewHolder holder = (TaskViewHolder) viewHolder;
        Task task = taskList.get(position);
        holder.title.setText(task.getTaskTitle());
        holder.count.setText(String.valueOf(task.getStatus()));

        Glide.with(context)
                .load(task.getTaskPhoto())
                .into(holder.thumbnail);

        holder.overflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(holder.overflow);
            }
        });
    }

    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu(View view) {
        // inflate menu
        PopupMenu popup = new PopupMenu(context, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_task, popup.getMenu());
        popup.setOnMenuItemClickListener(new TaskMenuListener());
        popup.show();
    }


    @Override
    public int getItemCount() {
        return taskList.size();
    }


    /**
     * Click listener for popup menu items
     */
    class TaskMenuListener implements PopupMenu.OnMenuItemClickListener {

        public TaskMenuListener() {}

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(context, "Add to favourite", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_play_next:
                    Toast.makeText(context, "Play next", Toast.LENGTH_SHORT).show();
                    return true;
                default:
            }
            return false;
        }
    }

    public static class TaskViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView count;
        ImageView thumbnail;
        ImageView overflow;

        public TaskViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.task_title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            overflow = (ImageView) view.findViewById(R.id.overflow);
        }
    }
}
