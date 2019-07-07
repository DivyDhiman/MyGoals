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

public class Adapter_thoughts extends RecyclerView.Adapter<Adapter_thoughts.ViewHolder> {

    private View view;
    private Context resultScreen;
    private ArrayList<HashMap<String, Object>> report_list;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public TextView text_listdata, text_listath;

        public ViewHolder(View view) {
            super(view);

            mView = view;
            text_listdata = (TextView) view.findViewById(R.id.text_listdata);
            text_listath = (TextView) view.findViewById(R.id.text_listath);
        }
    }

    public Adapter_thoughts(Context context, ArrayList<HashMap<String, Object>> report_list_all) {
        resultScreen = context;
        report_list = report_list_all;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_thought, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.text_listdata.setText(report_list.get(position).get("list").toString());
        holder.text_listath.setText(report_list.get(position).get("listath").toString());
    }

    @Override
    public int getItemCount() {
        return report_list.size();
    }

}