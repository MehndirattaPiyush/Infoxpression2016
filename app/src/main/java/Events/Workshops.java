package Events;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.example.satyamsehgal.infoxpression2016.R;
import com.example.satyamsehgal.infoxpression2016.Signup;

import Adapters.Customgrid;

/**
 * Created by satyam sehgal on 6/5/2016.
 */
public class Workshops extends Fragment{
    GridView grid;
    Button b2;
    String[] web = {"Sponsors Based Workshops" };
    String[] web2={"Sept 2nd-4th"};
    String[] web3 = {"Workshops will be lined soon."};

    int[] imageId = {R.drawable.workshops};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View workobj = inflater.inflate(R.layout.workshops, container, false);
        Customgrid adapter = new Customgrid(getActivity(), web,web2, imageId,web3);
        grid = (GridView) workobj.findViewById(R.id.grid_view);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                b2 = (Button) workobj.findViewById(R.id.grid_button2);
                // b2.setOnClickListener(onItemClick(this);)
                if (view.getId() == R.id.grid_button2) {
                    Intent obj = new Intent(getActivity(), Signup.class);
                    startActivity(obj);
                }
            }
        });
        return workobj;
    }
}
