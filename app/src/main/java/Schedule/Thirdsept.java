package Schedule;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.satyamsehgal.infoxpression2016.R;

import Adapters.Schedulegrid;

/**
 * Created by satyam sehgal on 6/10/2016.
 */
public class Thirdsept extends Fragment {
    ListView grid;
    String[] eventname = {"Backgear", "Quadcopter View", "Paper Presentation", "Java Jig","Linux-Ninja","Fast and Furious","Boostrapp",
            "MOZ | Lil Conf","KDE Lil Conf","VLSI Lil Conf","Python Lil Conf","Tad Break","Valedictory"  };

    String[] eventtime={"9:00, ETL-318 ","10:00, Main Ground","10:00, E-Block Auditorium","11:00,ETL-218","12:00,DTL-318",
            "12:00, ETL-318","12:30, ETL-404","12:00, E-Block Auditorium","13:30, C-Block Auditorium","13:30, E-Block Auditorium",
            "15:00, C-Block Auditorium", "16:00","17-18:00,E-Block Auditorium"};

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View firstobj= inflater.inflate(R.layout.thirdsept,container,false);
        Schedulegrid adapter = new Schedulegrid(getActivity(), eventname,eventtime);
        grid = (ListView) firstobj.findViewById(R.id.grid_view_schedule);
        grid.setAdapter(adapter);
        return firstobj;
    }
}
