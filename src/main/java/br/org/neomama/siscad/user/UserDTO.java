package br.org.neomama.siscad.user;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class UserDTO {

    private Long id;
    private String registrant;
    private LocalDate registrationDate;
    private Situation situation;
    private String name;
    private LocalDate birthdate;
    private String rg;
    private String cpf;
    private String cep;
    private String address;
    private String complement;
    private String neighborhood;
    private String city;
    private String uf;
    private String mobileNumber;
    private String phoneToMessage;
    private String email;
    private String occupation;
    private String workspace;
    private WorkStatus workStatus;
    private boolean participantSupportGroup;
    private String groupName;
    private String groupActivity;
    private String howDidYouFindUs;
    private String obs;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.registrant = user.getName();
        this.registrationDate = user.getRegistrationDate();
        this.situation = user.getSituation();
        this.name = user.getName();
        this.birthdate = user.getBirthdate();
        this.rg = user.getRg();
        this.cpf = user.getCpf();
        this.cep = user.getCep();
        this.address = user.getAddress();
        this.complement = user.getComplement();
        this.neighborhood = user.getNeighborhood();
        this.city = user.getCity();
        this.uf = user.getUf();
        this.mobileNumber = user.getMobileNumber();
        this.phoneToMessage = user.getPhoneToMessage();
        this.email = user.getEmail();
        this.occupation = user.getOccupation();
        this.workspace = user.getWorkspace();
        this.workStatus = user.getWorkStatus();
        this.participantSupportGroup = user.isParticipantSupportGroup();
        this.groupName = user.getGroupName();
        this.groupActivity = user.getGroupActivity();
        this.howDidYouFindUs = user.getHowDidYouFindUs();
        this.obs = user.getObs();
    }

    public static List<UserDTO> dtoTo(List<User> users) {
        return users.stream().map(UserDTO::new).toList();
    }

    public Long getId() {
        return id;
    }

    public String getRegistrant() {
        return registrant;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public Situation getSituation() {
        return situation;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCep() {
        return cep;
    }

    public String getAddress() {
        return address;
    }

    public String getComplement() {
        return complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCity() {
        return city;
    }

    public String getUf() {
        return uf;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getPhoneToMessage() {
        return phoneToMessage;
    }

    public String getEmail() {
        return email;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getWorkspace() {
        return workspace;
    }

    public WorkStatus getWorkStatus() {
        return workStatus;
    }

    public boolean isParticipantSupportGroup() {
        return participantSupportGroup;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupActivity() {
        return groupActivity;
    }

    public String getHowDidYouFindUs() {
        return howDidYouFindUs;
    }

    public String getObs() {
        return obs;
    }
}
