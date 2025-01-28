package hellojpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @Embedded
    private Address homeAddress;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @Column(name = "member_id")
    private List<AddressEntity> addressHistory = new ArrayList<>();

    //@ManyToOne
    //@JoinColumn(name = "team_id")
    //private Team team;


    public List<AddressEntity> getAddressHistory() {
        return addressHistory;
    }

    public void setAddressHistory(List<AddressEntity> addressHistory) {
        this.addressHistory = addressHistory;
    }

    public Address getAddress() {
        return homeAddress;
    }

    //public Team getTeam() {
    //    return team;
    //}

    //public void changeTeam(Team team) {
    //    this.team = team;
    //    team.getMembers().add(this);
    //}

    public Member() {
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }
}
