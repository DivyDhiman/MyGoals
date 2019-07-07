package adapter_all;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
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
public class Adapter_viewgoal extends RecyclerView.Adapter<Adapter_viewgoal.ViewHolder> {

    private View view;
    private Context resultScreen;
    private ArrayList<HashMap<String, String>> report_list,data;
    private HashMap<String,String> data_sub;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView goal_name,target_desc,target,actual,plusom;
        private RecyclerView data_recy;

        public ViewHolder(View view) {
            super(view);

            goal_name = (TextView) view.findViewById(R.id.goal_name);
            target_desc = (TextView) view.findViewById(R.id.target_desc);
            target = (TextView) view.findViewById(R.id.target);
            actual = (TextView) view.findViewById(R.id.actual);
            plusom = (TextView) view.findViewById(R.id.plusom);
            data_recy = (RecyclerView) view.findViewById(R.id.data);
        }
    }

    public Adapter_viewgoal(Context context, ArrayList<HashMap<String, String>> report_list_all) {
        resultScreen = context;
        report_list = report_list_all;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_viewgoal, parent, false);
        data = new ArrayList<>();
        data_sub = new HashMap<>();

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        Adapter_data adapter_data = new Adapter_data(resultScreen,data);
        holder. data_recy.setLayoutManager(new LinearLayoutManager(resultScreen));
        holder. data_recy.setAdapter(adapter_data);
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}