package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.satyamsehgal.infoxpression2016.R;

import java.util.List;

/**
 * Created by satyam sehgal on 6/10/2016.
 */
public class ListviewAdapter extends BaseAdapter {
    private Context mContext;
    private String[] instructions;

    public ListviewAdapter(Context c,String[] instructions){
        this.mContext=c;
        this.instructions=instructions;
    }

    @Override
    public int getCount() {
        return instructions.length;
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
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listsingle, null);
        }
        TextView obj = (TextView) convertView.findViewById(R.id.list_text);
        obj.setText(instructions[position]);
        return convertView;
    }
}
