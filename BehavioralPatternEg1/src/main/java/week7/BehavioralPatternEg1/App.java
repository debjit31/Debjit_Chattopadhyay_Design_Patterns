package week7.BehavioralPatternEg1;
public class App           //Implementing Observer design pattern
{
    public static void main( String[] args )
    {
    	Channel debjit = new Channel();
    	Members m1=new Members("Debjit");
    	Members m2=new Members("Anirban");
    	Members m3=new Members("Shreya");
    	Members m4=new Members("Swagata");
    	Members m5=new Members("Mike");
    	
    	debjit.membership(m1);
    	debjit.membership(m2);
    	debjit.membership(m3);
    	debjit.membership(m4);
    	debjit.membership(m5);
    	debjit.Cancelmembership(m5);
    	
    	m1.MemberChannel(debjit);
    	m2.MemberChannel(debjit);
    	m3.MemberChannel(debjit);
    	m4.MemberChannel(debjit);
    	m5.MemberChannel(debjit);
    	
    	debjit.upload("App released");
    	
    	
        
    }
}
