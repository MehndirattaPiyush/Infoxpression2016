package Schedule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import com.example.satyamsehgal.infoxpression2016.R;
import Adapters.Schedulegrid;

/**
 * Created by satyam sehgal on 6/5/2016.
 */
public class firstsept extends Fragment {

    ListView grid;
    String[] eventname = {"Inaugration", "Codester", "Circuitrix", "Greenovation","Friend Quiz Series","IEEE LiL Conf","Crusade - The Treasure Hunt",
	                        "Foss | Basics Code Sprint","C | Basics Code Sprint","Matlab | Basics Code Sprint"  };
    String[] eventtime={"11:00, E- Block Auditorium ","11:00, ETL-318","11:00, ETL-404","12:00,Main Ground","12:00, C-Block Auditorium",
	                         "14:30, E-Block Auditorium","16:00, Centre Stage","18-21:00,ETL-318","18-21:00,ETL-404","18-21:00,ETL-218"};

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View firstobj= inflater.inflate(R.layout.firstsept,container,false);
        Schedulegrid adapter = new Schedulegrid(getActivity(), eventname,eventtime);
        grid = (ListView) firstobj.findViewById(R.id.grid_view_schedule);
        grid.setAdapter(adapter);
        return firstobj;
    }

}
