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
public class Nontech extends Fragment {
    GridView grid;
    Button b2;
    String[] web = {"Clash on LAN","Crusade - Treasure Hunt","Geek Wars","Greenovation","Know it all","Rubix Cube","Tech Quiz" };
    String[] web2={"Sept 2nd-4th","Sept 2nd","Spet 3rd"," 1st June -3rd Sept","1st- 3rd Sept","Spet 2nd","Spet 3rd"};
    int[] imageId = {
            R.drawable.clashonlan,R.drawable.crusade2,R.drawable.geekwars,R.drawable.green,R.drawable.quiz,
           R.drawable.rubix, R.drawable.techquiz2 };
    String[] web3 = {"Get ready for an adrenaline rush and a test of your senses. Compete against participants of different colleges to triumph as the best LAN gaming team. We have for you, first person shooters, races and what not. So get ready to enter a world of virtual reality, and prove yourself the best.", 
	                 "The box of miracles and secrets is waiting for you. Come and explore a whole new world within. Experience fun, like you have never before. Apply your brain in every technical aspect and hunt for the treasure.", 
					 "Arguments are naturally constructive. They lead to a mind open to new ideas. In a field as dynamic as technology, we need to argue to keep ourselves on our toes and constantly updated. Thus, all our welcome to the technical debate.", 
					 "This event calls out all the thinkers who can come up with great and green ideas, to make this world a better place. These green ideas will help in sustainable development in the long run and help make our present environment eco-friendly",
					 "It is said that knowledge increases when it is shared. Through this event we are giving students an opportunity to share and increase their knowledge through a quiz competition. The quiz will cover a variety of topics testing the participants' knowledge in multiple fields. ", 
					 "A puzzle over which millions have spent millions of hours. The Rubik's Cube is a mind boggling toy."
					 ,"Come, participate and prove your technical knowledge in InfoX's event, TechQuiz in which teams compete against one another in an effort to prove themselves as the best and the brightest."};
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        final View nontechobj= inflater.inflate(R.layout.nontech,container,false);
        Customgrid adapter2 = new Customgrid(getActivity(), web,web2, imageId,web3);
        grid = (GridView) nontechobj.findViewById(R.id.grid_view);
        grid.setAdapter(adapter2);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                b2 = (Button) nontechobj.findViewById(R.id.grid_button2);
                // b2.setOnClickListener(onItemClick(this);)
                if (view.getId() == R.id.grid_button2) {
                    Intent obj = new Intent(getActivity(), Signup.class);
                    startActivity(obj);
                }
                switch (position) {

                    case 0:
                        Toast.makeText(getContext(), "Clash on LAN", Toast.LENGTH_SHORT).show();
                        // Intent obj = new Intent(getActivity(), Signup.class);
                        //startActivity(obj);
                        //  b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        break;
                    case 1:
                        Toast.makeText(getContext(), "Crusade - Treasure Hunt", Toast.LENGTH_SHORT).show();
                        // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj1 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj1);
                        break;
                    case 2:
                        Toast.makeText(getContext(), "Geek Wars", Toast.LENGTH_SHORT).show();
                        //   b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj2 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj2);
                        break;
                    case 3:
                        Toast.makeText(getContext(), "Greenovation", Toast.LENGTH_SHORT).show();
                        // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj3 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj3);
                        break;
                    case 4:
                        Toast.makeText(getContext(), "Know it all", Toast.LENGTH_SHORT).show();
                        //Intent obj4 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj4);
                        // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        break;
                    case 5:
                        Toast.makeText(getContext(), "Tech Quiz", Toast.LENGTH_SHORT).show();
                        // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj5 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj5);
                        break;
                    case 6:
                        Toast.makeText(getContext(), "Rubix Cube", Toast.LENGTH_SHORT).show();
                        // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj5 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj5);
                        break;
                }
            }
        });
        return nontechobj;
    }
}
