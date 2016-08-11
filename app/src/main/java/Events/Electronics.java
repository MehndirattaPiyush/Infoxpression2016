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
import android.widget.Toast;

import com.example.satyamsehgal.infoxpression2016.R;
import com.example.satyamsehgal.infoxpression2016.Signup;

import Adapters.Customgrid;

/**
 * Created by satyam sehgal on 6/4/2016.
 */
public class Electronics extends Fragment {

    GridView grid;
    Button b2;
    String[] web = {"Circuitx","Fast and Furious","Mind the line","Robo Hustle","Quadcopter View" };
    String[] web2={"Sept 2nd, 11:00","Sept 4th, 12:00","Sept 3rd, 11:30","Sept 3rd, 9:00","Sept 4th, 9:00"};
    String[] web3 = {"This event will mainly test the application based knowledge of the electronic circuits used for various purposes. It will cover designs from basic logical circuits to hardcore electrical circuits; their rectification and building of the correct circuit. It will comprise of different levels, including both hardware and software aspects, with increasing difficulty levels.", 
	"This event is a hurdle race designed for robots. Teams will compete against each other while racing their robots on a track with hurdles. The winning team will be the one whose robot crosses the hurdles and finishes the race in minimum time. Penalty time will be added to the total time in case a hurdle is skipped or the robot touches the boundary.", 
	"Follow the path to success by designing an efficient line following robot. The event comprises of a track laid in black strip on white sheet, having a starting and finishing line with some intermediate checkpoints.", 
	"This event will have two teams competing against each other. There will be different balls in the arena, which will have a hole in the center. Each ball will have some points. Participants will try to get as many balls as they can, using their robots while their opponents try the same", 
	"Our Signature event. Teams must build a drone on the spot and demo it by ﬂying upto 4 stories of height without breaking a sweat."
	};
    int[] imageId = {R.drawable.circuitrix2,R.drawable.fastandfurious,R.drawable.mindtheline,R.drawable.roborace,R.drawable.quad};


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        final View electroobj= inflater.inflate(R.layout.electronics,container,false);
        Customgrid adapter = new Customgrid(getActivity(), web,web2, imageId,web3);
        grid = (GridView) electroobj.findViewById(R.id.grid_view);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                b2 = (Button) electroobj.findViewById(R.id.grid_button2);
                // b2.setOnClickListener(onItemClick(this);)
                if (view.getId() == R.id.grid_button2) {
                    Intent obj = new Intent(getActivity(), Signup.class);
                    startActivity(obj);
                }
                switch (position) {

                    case 0:
                        Toast.makeText(getContext(), "Circuitx", Toast.LENGTH_SHORT).show();
                        // Intent obj = new Intent(getActivity(), Signup.class);
                        //startActivity(obj);
                        //  b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        break;
                    case 1:
                        Toast.makeText(getContext(), "Mind the line", Toast.LENGTH_SHORT).show();
                        // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj1 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj1);
                        break;
                    case 2:
                        Toast.makeText(getContext(), "Robo Hustle", Toast.LENGTH_SHORT).show();
                        //   b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj2 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj2);
                        break;
                    case 3:
                        Toast.makeText(getContext(), "Quadcopter View", Toast.LENGTH_SHORT).show();
                        // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj3 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj3);
                        break;

                }
            }
        });
        return electroobj;
    }
}
