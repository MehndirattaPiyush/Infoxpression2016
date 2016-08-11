package Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.satyamsehgal.infoxpression2016.R;
import com.example.satyamsehgal.infoxpression2016.Signup;

import java.util.zip.Inflater;

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by satyam sehgal on 4/4/2016.
 */
public class Customgrid extends BaseAdapter {
    private Context mContext;
    private final String[] web;
    private final String[] web2;
    private final String[] web3;
    private final int[] Imageid;

    public Customgrid(Context c, String[] web, String[] web2, int[] Imageid,String[] web3) {
        mContext = c;
        this.Imageid = Imageid;
        this.web = web;
        this.web2 = web2;
        this.web3 = web3;
    }

    @Override
    public int getCount() {
        return web.length;
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
    public View getView(final int position, View convertView, final ViewGroup parent) {
        // TODO Auto-generated method stub

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.grid_single, null);
        }
       Button b2 = (Button) convertView.findViewById(R.id.grid_button2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((GridView)parent).performItemClick(v,position,0);
            }
        });
        TextView textView = (TextView) convertView.findViewById(R.id.grid_text);
        TextView textView2 = (TextView) convertView.findViewById(R.id.grid_text2);
        TextView textView3 = (TextView) convertView.findViewById(R.id.grid_text3);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.grid_image);
        textView.setText(web[position]);
        textView2.setText(web2[position]);
        textView3.setText(web3[position]);
        imageView.setImageResource(Imageid[position]);

        return convertView;
    }

}
