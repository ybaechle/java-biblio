package model;


public class Member {
    private final String name;
    private final String memberId;

    // Constructeur
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }
}
