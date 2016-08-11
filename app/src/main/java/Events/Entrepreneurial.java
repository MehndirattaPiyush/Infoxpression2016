package Events;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import com.example.satyamsehgal.infoxpression2016.R;
import com.example.satyamsehgal.infoxpression2016.Signup;

import Adapters.Customgrid;

/**
 * Created by satyam sehgal on 6/4/2016.
 */
public class Entrepreneurial extends Fragment {
    GridView grid;
    Button b2;
    String[] web = {"SAMADHAN" };
    String[] web2={"June 1- Sept 4"};
    int[] imageId = {R.drawable.samadhan_test2};
    String[] web3 = {"Have an idea to idddmprove or bring change to your college / university campus. We give you the plaorm to pitch it. Come and show us your working prototype, and get funds, mentorship, fundings and what not to make it big. Sweat yourself, Get funded"};
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        final View entreobj= inflater.inflate(R.layout.entrepreneurial,container,false);
        Customgrid adapter = new Customgrid(getActivity(), web,web2, imageId,web3);
        grid = (GridView) entreobj.findViewById(R.id.grid_view);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                b2 = (Button) entreobj.findViewById(R.id.grid_button2);
                // b2.setOnClickListener(onItemClick(this);)
                if (view.getId() == R.id.grid_button2) {
                    Intent obj = new Intent(getActivity(), Signup.class);
                    startActivity(obj);
                }
            }
        });
        return entreobj;
    }
}
