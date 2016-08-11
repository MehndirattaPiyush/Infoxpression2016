package Events;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.satyamsehgal.infoxpression2016.R;
import com.example.satyamsehgal.infoxpression2016.Signup;

import Adapters.Customgrid;

/**
 * Created by satyam sehgal on 6/4/2016.
 */
public class Programming extends Fragment {

    View pobj;
    TextView t;
    GridView grid;
    Button  b2;
    String[] web = {"Algoholics", "Back Gear", "Blind Coding", "Bootstrap", "Codester",
            "Data Crunchers, Database", "JAVAJIG", "Linux Command Ninja", "Web Bee"};

    String[] web2 = {"Sept 2nd, 9:00", "Sept 4th, 9:00", "Sept 3rd, 16:00", "Sept 4th, 12:30", "Sept 3rd, 9:00", "Sept 2nd, Online Quiz", "Sept 4th, 11:00", "Sept 3rd, 12:00", "Sept 3rd, 11:00"};

    int[] imageId = {
            R.drawable.algoholics2, R.drawable.backgear, R.drawable.blindcoding2, R.drawable.bootstrapp2, R.drawable.codester,
            R.drawable.datacrunchers2, R.drawable.javajig2, R.drawable.linux2, R.drawable.webbee
    };

    String[] web3 = {"We are obsessed with solutions to all our problems. But we know that a problem may have any number of solutions. To find out the least complex path to our solutions we bring you algoholics. Write the best pseudo code and prove your mettle.", 
	                 "This contest will challenge the conventional norms of programming where in a programmer generates output from the code. Here, we present the competitors with the output and the programmers are required to apply their reverse engineering skills to generate the code that gives this output.",
					 "All the computer lovers,show’em your bond with the PC and code without having a peek at the Desktop.", 
					 "Mobile applications give us great power. They are something we can access on the go and perform our day to day tasks. A perfect application is creative, fast and actually useful. And these are the very parameters we look for in APP DEVELOPMENT.", 
					 "To challenge your very basic understanding of object oriented programming, we bring to you the code jam. Here we check not only your problem solving skills, but also your grasp over this fascinating language.",
					 "Database management Is an indispensable part of current scenario, it makes us analyze and get a vivid picture. If you find your niche in this sphere, we are providing you with a chance to grab this opportunity. So, wear your thinking hats, Very less is needed to come up, it is all within yourself, in your way of thinking",
                    "JAVA is a necessity in today’s world. Since its inception in the days when it was ‘oak’, JAVA’s contributions have been innumerable. Called the most robust programming language, the JAVA JIG tests your proficiency in this language. It will test how well you know the nuances of JAVA as well as your skills as a coder.", 
			        "To salute this phenomena of open source technology, we bring to you the LINUX COMMAND NINJA. Show the world how well you know the linux command line and how can you contribute to this dynamic technology.",
			        "The task, an interactive web page, with a number of , is to be designed. The technologies that the designer may use are CSS, JS, and HTML or you can follow the path of .net and PHP. The choice is yours.", 
			        };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        pobj = inflater.inflate(R.layout.programming, container, false);
        Customgrid adapter = new Customgrid(getActivity(), web, web2, imageId, web3);
        grid = (GridView) pobj.findViewById(R.id.grid_view);
        grid.setAdapter(adapter);


        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                b2 = (Button) pobj.findViewById(R.id.grid_button2);
               // b2.setOnClickListener(onItemClick(this);)
                if (view.getId() == R.id.grid_button2) {
                    Intent obj = new Intent(getActivity(), Signup.class);
                    startActivity(obj);
                }
                switch (position) {

                    case 0:
                        Toast.makeText(getContext(), "Algoholics", Toast.LENGTH_SHORT).show();
                      //  t=(TextView) pobj.findViewById(R.id.event_text);
                      //  t.setText("Algoholics");
                       // Intent obj = new Intent(getActivity(), Signup.class);
                        //startActivity(obj);
                      //  b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        break;
                    case 1:
                        Toast.makeText(getContext(), "Back Gear", Toast.LENGTH_SHORT).show();
                       // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj1 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj1);
                        break;
                    case 2:
                        Toast.makeText(getContext(), "Blind Coding", Toast.LENGTH_SHORT).show();
                     //   b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj2 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj2);
                        break;
                    case 3:
                        Toast.makeText(getContext(), "Bootstrap", Toast.LENGTH_SHORT).show();
                       // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj3 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj3);
                        break;
                    case 4:
                        Toast.makeText(getContext(), "Codester", Toast.LENGTH_SHORT).show();
                        //Intent obj4 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj4);
                       // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        break;
                    case 5:
                        Toast.makeText(getContext(), "Data Crunchers, Database", Toast.LENGTH_SHORT).show();
                       // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj5 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj5);
                        break;
                    case 6:
                        Toast.makeText(getContext(), "JAVAJIG", Toast.LENGTH_SHORT).show();
                       // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj6 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj6);
                        break;
                    case 7:
                        Toast.makeText(getContext(), "Linux Command Ninja", Toast.LENGTH_SHORT).show();
                        //Intent obj67 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj67);
                       // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        break;
                    case 8:
                        Toast.makeText(getContext(), "Web Bee", Toast.LENGTH_SHORT).show();
                      //  b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj69 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj69);
                        break;


                }
            }
        });
        return pobj;
    }


            @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        grid = (GridView) pobj.findViewById(R.id.grid_view);

    }

}
