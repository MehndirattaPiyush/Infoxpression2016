package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.satyamsehgal.infoxpression2016.R;

/**
 * Created by satyam sehgal on 7/31/2016.
 */
public class Sponsorsgrid extends BaseAdapter {
    private Context mContext;
    private final String[] a;
    private final int[] Imageid;

    public Sponsorsgrid(Context c, String[] a, int[] Imageid) {
        mContext = c;
        this.Imageid = Imageid;
        this.a = a;
    }

    @Override
    public int getCount() {
        return a.length;
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
            convertView = inflater.inflate(R.layout.sponsors_grid, null);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.sponsor_grid_text);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.sponsor_grid_image);
        textView.setText(a[position]);
        imageView.setImageResource(Imageid[position]);

        return convertView;

    }
}
