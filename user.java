import java.util.ArrayList;

public class user {

    protected    String emile;
    protected   String id;
    protected String name;
    protected String password;

    protected String location;
    protected  String  usertype;
    protected  double phone ;



    //  user arr1[];


    protected  static ArrayList<player> playerData = new ArrayList<player>();
    protected  static ArrayList<playgroundowner> playgroundownersdata = new ArrayList<playgroundowner>();
    protected  static ArrayList<administrator> administratorsData = new ArrayList<>();
    user(String name1,String usertype1,String id1,String emile1,String location1,double phone1,String password1)
    {

        name=name1;
        usertype=usertype1;
        id=id1;
        emile=emile1;
        location=location1;
        phone=phone1;
        password=password1;

    }
    user(user c)
    {
        name=c.name;
        usertype=c.usertype;
        id=c.id;
        emile=c.emile;
        location=c.location;
        phone=c.phone;
        password=c.password;

    }
    user()
    {}
    boolean check_email(String email)
    {
        boolean index_a,index_dot;
        index_a=email.contains("@");
        index_dot=email.contains(".");
        if(index_a && index_dot)
        {
            for(int i=0;i<playerData.size();i++)
            {
                if(playerData.get(i).emile.equals(email))
                {

                    return false;
                }
            }
            for (int i=0;i<playgroundownersdata.size();i++)
            {
                if(playgroundownersdata.get(i).emile.equals(email))
                {
                    return false;
                }
            }
            return true;
        }
        else
        {return false;}


    }





}
