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
public class Secondsept extends Fragment{
    ListView grid;
    String[] eventname = {"Algoholics", "Robohustle", "FOSS Hero", "Web Bee","Mind the line","Geek Wars","Rubiks Cube",
            "IETE Lil Conf","Blind Coding","Online Events Presentations","FOSS | Code Sprint","Competitive Coding | Code Sprint ",
            "Python/PHP | Basic Code Sprint","Embedded C | Basics Code Sprint"};
    String[] eventtime={"9:00,ETL-318 ","9:00,ETL-404","9:00,ETL-505","11:00, ETL-218","11:30,ETL-404",
            "12:00,C-Block Auditorium","13:00, E-Block Auditorium","14:30, E-Block Auditorium","16:00,ETL-318","16:00, E-Block Auditorium",
            "18-21:00,ETL-318","18-21:00,ETL-318","18-21:00,ETL-404","18-21:00,ETL-218"};

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View firstobj= inflater.inflate(R.layout.secondsept,container,false);
        Schedulegrid adapter = new Schedulegrid(getActivity(), eventname,eventtime);
        grid = (ListView) firstobj.findViewById(R.id.grid_view_schedule);
        grid.setAdapter(adapter);
        return firstobj;
    }
}
