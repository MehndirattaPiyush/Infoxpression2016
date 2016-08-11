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
public class Codesprint extends Fragment {
    GridView grid;
    Button  b2;
    String[] web = {"C | Code Sprint","Competitive Coding Sprint","FOSS | Sprint","GET GIT | SPRINT","MATLAB | SPRINT","PYTHON & PHP SPRINT" };
    String[] web2={"Sept 2nd, 18:00-21:00","Sept 3rd, 18:00-21:00,","Sept 2nd, 18:00-21:00","Sept 3rd, 18:00-21:00","Sept 2nd, 18:00-21:00","Spet 3rd,18:00-21:00"};

    String[] web3 = {"For Beginners, We have the best dish we can come up with. Code a Hands-on Project in mentorship of Spoken Tutorial and Foss Club, USICT along with Techspace, USICT. We will start our lessons from basic coding skills, hence grab this opportunity.",
	"Learn the basics of Competitive coding and lots of hackathon will be there to sharpen your skills.", 
	"Fall in love with Open Source, first love of the computer geeks. We have set the stage for you to learn more of your life partner here. Come and Join us at Foss Sprints and Hackathons.",
	"We are planning an electronics sprint too. If you feel any technology should be considered then let us know at usict.techspace@gmail.com.", 
	"Learn matlab with us and work upon a hands-on project to let yourself feel up and motivated to achieve more.", 
	"Learn Python and Django with in a month with Techspace and SAINT."};
    int[] imageId = {
            R.drawable.sprint,R.drawable.sprint,R.drawable.sprint,R.drawable.sprint,R.drawable.sprint,
            R.drawable.sprint };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View codesprintobj = inflater.inflate(R.layout.codesprint, container, false);
        Customgrid adapter1 = new Customgrid(getActivity(), web,web2, imageId,web3);
        grid = (GridView) codesprintobj.findViewById(R.id.grid_view);
        grid.setAdapter(adapter1);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
               b2 = (Button) codesprintobj.findViewById(R.id.grid_button2);
                // b2.setOnClickListener(onItemClick(this);)
                if (view.getId() == R.id.grid_button2) {
                    Intent obj = new Intent(getActivity(), Signup.class);
                    startActivity(obj);
                }
                switch (position) {

                    case 0:
                        Toast.makeText(getContext(), "C | Code Sprint", Toast.LENGTH_SHORT).show();
                        // Intent obj = new Intent(getActivity(), Signup.class);
                        //startActivity(obj);
                        //  b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        break;
                    case 1:
                        Toast.makeText(getContext(), "Competitive Coding Sprint", Toast.LENGTH_SHORT).show();
                        // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj1 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj1);
                        break;
                    case 2:
                        Toast.makeText(getContext(), "FOSS | Sprint", Toast.LENGTH_SHORT).show();
                        //   b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj2 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj2);
                        break;
                    case 3:
                        Toast.makeText(getContext(), "GET GIT | SPRINT", Toast.LENGTH_SHORT).show();
                        // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj3 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj3);
                        break;
                    case 4:
                        Toast.makeText(getContext(), "MATLAB | SPRINT", Toast.LENGTH_SHORT).show();
                        //Intent obj4 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj4);
                        // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        break;
                    case 5:
                        Toast.makeText(getContext(), "PYTHON & PHP SPRINT", Toast.LENGTH_SHORT).show();
                        // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj5 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj5);
                        break;
                }
            }
        });
        return codesprintobj;
    }
}