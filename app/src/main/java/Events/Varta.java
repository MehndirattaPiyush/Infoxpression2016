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

public class Varta extends Fragment {
    GridView grid;
    Button b2;
    String[] web = {"IEEE | Lil Conf", "IETE | Lil Conf", "KDE | Lil Conf", "MOZ | Lil Conf", "Py | Lil Conf"};
    String[] web2 = {"Sept 2nd, 14:30", "Sept 3rd, 14:30,", "Sept 4th, 13:30", "Sept 4th, 12:00", "Sept 4th, 15:00"};
    int[] imageId = {
            R.drawable.ieee, R.drawable.iete, R.drawable.kde, R.drawable.mozilla_test2, R.drawable.python2};
    String[] web3 = {"Have an idea to improve or bring change to your college / university campus. We give you the plaorm to pitch it. Come and show us your working prototype, and get funds, mentorship, fundings and what not to make it big. Sweat yourself, Get funded", 
	"A li'l Conference from IETE , Delhi, with scholars will be seen discussing hot topics of research areas.", 
	"If you love Krita, Gcompris, Plasma, QT or even C++, thos talk is for you. Foss Club, USICT has organized a tad talk session by KDE contributors.", 
	"One day bonding session with Mozilla, Delhi. Moz Lil conferece is such an opportunity which merely comes so easily to enhance your foss knowledge with mozilla.", 
	"Teaser Conference of Pycon | India. Check it out, its going to be really cool event by Pycon India Team."};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View vartaobj = inflater.inflate(R.layout.entrepreneurial, container, false);
        Customgrid adapter = new Customgrid(getActivity(), web, web2, imageId, web3);
        grid = (GridView) vartaobj.findViewById(R.id.grid_view);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                b2 = (Button) vartaobj.findViewById(R.id.grid_button2);
                // b2.setOnClickListener(onItemClick(this);)
                if (view.getId() == R.id.grid_button2) {
                    Intent obj = new Intent(getActivity(), Signup.class);
                    startActivity(obj);
                }
                switch (position) {

                    case 0:
                        Toast.makeText(getContext(), "IEEE | Lil Conf", Toast.LENGTH_SHORT).show();
                        // Intent obj = new Intent(getActivity(), Signup.class);
                        //startActivity(obj);
                        //  b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        break;
                    case 1:
                        Toast.makeText(getContext(), "IETE | Lil Conf", Toast.LENGTH_SHORT).show();
                        // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj1 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj1);
                        break;
                    case 2:
                        Toast.makeText(getContext(), "KDE | Lil Conf", Toast.LENGTH_SHORT).show();
                        //   b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj2 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj2);
                        break;
                    case 3:
                        Toast.makeText(getContext(), "MOZ | Lil Conf", Toast.LENGTH_SHORT).show();
                        // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj3 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj3);
                        break;
                    case 4:
                        Toast.makeText(getContext(), "Py | Lil Conf", Toast.LENGTH_SHORT).show();
                        // b2.setBackgroundColor(Color.parseColor("#FFF86524"));
                        //Intent obj3 = new Intent(getActivity(), Signup.class);
                        //startActivity(obj3);
                        break;

                }
            }
        });
        return vartaobj;
    }
}