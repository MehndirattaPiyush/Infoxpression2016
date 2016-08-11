package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.satyamsehgal.infoxpression2016.R;

/**
 * Created by satyam sehgal on 6/5/2016.
 */
public class Schedulegrid extends BaseAdapter {
    private Context mContext;
    private final String[] eventname;
    private final String[] eventtime;

    public Schedulegrid(Context c, String[] eventname, String[] eventtime) {
        mContext = c;
        this.eventname = eventname;
        this.eventtime = eventtime;
    }
    @Override
    public int getCount() {
        return eventname.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.grid_single1, null);
        }


        TextView textViews = (TextView) convertView.findViewById(R.id.grid_text_schedule1);
        TextView textViews2 = (TextView) convertView.findViewById(R.id.grid_text_schedule2);
        textViews.setText(eventname[position]);
        textViews2.setText(eventtime[position]);

        return convertView;
    }


}
