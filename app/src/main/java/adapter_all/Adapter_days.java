package adapter_all;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.actiontracker.mygoals.R;

import java.util.ArrayList;
import java.util.HashMap;

public class Adapter_days extends RecyclerView.Adapter<Adapter_days.ViewHolder> {

    private View view;
    private Context resultScreen;
    private ArrayList<HashMap<String, String>> report_list ;
    private int i;
    private ArrayList<String> data_store;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView text_listdata;
        private ImageView check_uncheck;
        private LinearLayout click_all;

        public ViewHolder(View view) {
            super(view);

            click_all = (LinearLayout) view.findViewById(R.id.click_all);
            text_listdata = (TextView) view.findViewById(R.id.text_listdata);
            check_uncheck = (ImageView) view.findViewById(R.id.check_uncheck);
        }
    }

    public Adapter_days(Context context, ArrayList<HashMap<String, String>> report_list_all) {
        resultScreen = context;
        report_list = report_list_all;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_days, parent, false);

        data_store = new ArrayList<>();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        if (data_store != null) {
                if (data_store.contains(report_list.get(position).get("days"))) {
                    holder.check_uncheck.setImageResource(R.drawable.radiotrue);
                } else {
                    holder.check_uncheck.setImageResource(R.drawable.radiofalse);
                }
        } else {
            holder.check_uncheck.setImageResource(R.drawable.radiofalse);
        }
        holder.text_listdata.setText(report_list.get(position).get("days"));
        holder.click_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (data_store.contains(report_list.get(position).get("days"))) {
                    for (i = 0; i< data_store.size();i++){
                        if(data_store.get(i).equals(report_list.get(position).get("days"))){
                            data_store.remove(i);
                            holder.check_uncheck.setImageResource(R.drawable.radiofalse);
                            break;
                        }
                    }
                } else {
                    data_store.add(report_list.get(position).get("days"));
                    holder.check_uncheck.setImageResource(R.drawable.radiotrue);
                }
            }
        }
    );
}

    @Override
    public int getItemCount() {
        return report_list.size();
    }

}