package com.pluralsight;

public class Actor {
    private int actorId;
    private String firstName;
    private String lastName;

    public Actor(int actorId, String lastName, String firstName) {
        this.actorId = actorId;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

}
