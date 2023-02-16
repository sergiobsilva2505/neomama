package br.org.neomama.siscad.user;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String registrant;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate registrationDate;
    private String code;
    private String name;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthdate;
    private String rg;
    private String cpf;
    private String cep;
    private String address;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String uf;
    private String mobileNumber;
    private String phoneToMessage;
    private String email;
    private String occupation;
    private String workspace;
    private boolean participantSupportGroup;
    private String groupName;
    private String groupActivity;
    private String howDidYouFindUs;
    private String obs;
    @Enumerated(EnumType.STRING)
    private WorkStatus workStatus;
    @Enumerated(EnumType.STRING)
    private Situation situation;

    public User() {
    }

    public User(String registrant, LocalDate registrationDate, String code, String name, LocalDate birthdate,
                String rg, String cpf, String cep, String address, String number, String complement, String neighborhood,
                String city, String uf, String mobileNumber, String phoneToMessage, String email, String occupation,
                String workspace, boolean participantSupportGroup, String groupName, String groupActivity,
                String howDidYouFindUs, String obs, WorkStatus workStatus, Situation situation) {
        this.registrant = registrant;
        this.registrationDate = registrationDate;
        this.code = code;
        this.name = name;
        this.birthdate = birthdate;
        this.rg = rg;
        this.cpf = cpf;
        this.cep = cep;
        this.address = address;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.uf = uf;
        this.mobileNumber = mobileNumber;
        this.phoneToMessage = phoneToMessage;
        this.email = email;
        this.occupation = occupation;
        this.workspace = workspace;
        this.participantSupportGroup = participantSupportGroup;
        this.groupName = groupName;
        this.groupActivity = groupActivity;
        this.howDidYouFindUs = howDidYouFindUs;
        this.obs = obs;
        this.workStatus = workStatus;
        this.situation = situation;
    }

    public User toModel(NewUserForm form) {
        this.registrant = form.getRegistrant();
        this.registrationDate = form.getRegistrationDate();
        this.code = form.getUserCode();
        this.name = form.getName();
        this.birthdate = form.getBirthdate();
        this.rg = form.getRg();
        this.cpf = form.getCpf();
        this.cep = form.getCep();
        this.address = form.getAddress();
        this.number = form.getNumber();
        this.complement = form.getComplement();
        this.neighborhood = form.getDistrict();
        this.city = form.getCity();
        this.uf = form.getUf();
        this.mobileNumber = form.getMobileNumber();
        this.phoneToMessage = form.getPhoneToMessage();
        this.email = form.getEmail();
        this.occupation = form.getOccupation();
        this.workspace = form.getWorkspace();
        this.participantSupportGroup = form.isParticipantSupportGroup();
        this.groupName = form.getGroupName();
        this.groupActivity = form.getGroupActivity();
        this.howDidYouFindUs = form.getHowDidYouFindUs();
        this.obs = form.getObs();
        this.workStatus = form.getWorkStatus();
        this.situation = form.getSituation();
        return this;
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

    public String getCode() {
        return code;
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

    public String getNumber() {
        return number;
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

    public WorkStatus getWorkStatus() {
        return workStatus;
    }

    public Situation getSituation() {
        return situation;
    }
}
