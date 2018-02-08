package references;

import java.util.ArrayList;
import java.util.List;

public class Member {

    public String name;
    public List<Member> connections = new ArrayList<>(); // az osztály saját típusu adattagot tartalmaz.

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Member> getConnections() {
        return connections;
    }

    void connectMember(Member member){
        connections.add(member);
    }



    public List<String> connectedNames(){
        List<String> list = new ArrayList<>();
        for(Member fgh : connections){
            String temp = fgh.name.toString();
            list.add(temp);
        }

        return list;
    }

    public String toString(){
        String temp= "";
        for (String x : this.connectedNames()){
            temp += x.toString() + " ";
        }

        return this.name + temp;
    }
}
