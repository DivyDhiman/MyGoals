package adapter_all;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.actiontracker.mygoals.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Suman Singh on 21-09-2016.
 */
public class Adapter_data extends RecyclerView.Adapter<Adapter_data.ViewHolder> {

    private View view;
    private Context resultScreen;
    private ArrayList<HashMap<String, String>> report_list;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView date,target,actual,plusom;

        public ViewHolder(View view) {
            super(view);

            date = (TextView) view.findViewById(R.id.date);
            target = (TextView) view.findViewById(R.id.target);
            actual = (TextView) view.findViewById(R.id.actual);
            plusom = (TextView) view.findViewById(R.id.plusom);
        }
    }

    public Adapter_data(Context context, ArrayList<HashMap<String, String>> report_list_all) {
        resultScreen = context;
        report_list = report_list_all;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_data, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

    }

    @Override
    public int getItemCount() {
        return 25;
    }
}