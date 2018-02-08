package references;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    List<Member> members = new ArrayList<>(); // összes tagot tartalmazza ;

    public void addMember(String name) {
        Member newMember = new Member(name);
        members.add(newMember);
    }

    public void connect(String name, String anotherName) {
        Member t01 = null;
        Member t02 = null;

        for(Member currentMember : members){
            if(currentMember.getName().equals(name)){
                t01 = currentMember;
            }
        }
        for(Member currentMember : members){
            if(currentMember.getName().equals(anotherName)){
                t02 = currentMember;
            }
        }

        t01.connectMember(t02);
    }

    public Member findByName(String name){
        Member temp = null;
        for(Member currentMember : members){
            if(currentMember.getName().equals(name)){
                temp =  currentMember;
            }
        }
        return temp;
    }

    List<String> bidirectionalConnections(){
        String temp = "";
        List<String> out = new ArrayList<>();
        for(Member currentMember: members){
            for(Member mm : currentMember.getConnections()){

                    if(currentMember.getConnections().contains(mm)){
                        temp=mm.getName()+" - "+currentMember.getName();
                        out.add(temp);
                    }

            }
        }
        return out;
    }

    public List<String> bidirectionalConnections02(){
        List<String> bidicons=new ArrayList<>();
        for(int i=0;i<members.size();i++){
            Member mem1=members.get(i);

            for (int j=0;j<mem1.getConnections().size();j++){
                Member mem2=mem1.getConnections().get(j);

                if(mem2.getConnections().contains(mem1)){
                    String connection=mem1.getName()+" - "+mem2.getName();
                    bidicons.add(connection);
                }

            }
        }
        return bidicons;
    }

    public String toString(){
        String out = "";
        for(Member x : members){
            out += x.toString();
        }
        return out;
    }

}
