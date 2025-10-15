package org.hbrs.se1.ws25.exercises.uebung2;

import java.util.ArrayList;
import java.util.List;

public class Container {


    private final List<Member> members = new ArrayList<>();

    public void addMember(Member member) throws ContainerException {
        for (Member m : members) {
            if (m.getID().equals(member.getID())) {
                throw new ContainerException(member.getID());
            }
        }
        members.add(member);
    }
    public String deleteMember(Integer id) {
        for (Member m : members) {
            if (m.getID().equals(id)) {
                members.remove(m);
                return "Member mit ID: " + id + " wurde gelöscht.";
            }
        }
        return "Kein Member mit ID " + id + " gefunden.";
    }
    public void dump() {
        if (members.isEmpty()) {
            System.out.println("Container ist leer.");
        } else {
            for (Member m : members) {
                System.out.println(m);
            }
        }
    }

    public int size() {
        return members.size();
    }
}