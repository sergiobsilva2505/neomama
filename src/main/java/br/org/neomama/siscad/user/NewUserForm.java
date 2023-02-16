package br.org.neomama.siscad.user;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

public class NewUserForm {

    private String registrant;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate registrationDate;
    private String userCode;
    private Situation situation;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthdate;
    private String rg;
    private String cpf;
    private String cep;
    private String address;
    private String number;
    private String complement;
    private String district;
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

    public NewUserForm() {
    }



    public void setRegistrant(String registrant) {
        this.registrant = registrant;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setPhoneToMessage(String phoneToMessage) {
        this.phoneToMessage = phoneToMessage;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public void setWorkStatus(WorkStatus workStatus) {
        this.workStatus = workStatus;
    }

    public void setParticipantSupportGroup(boolean participantSupportGroup) {
        this.participantSupportGroup = participantSupportGroup;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setGroupActivity(String groupActivity) {
        this.groupActivity = groupActivity;
    }

    public void setHowDidYouFindUs(String howDidYouFindUs) {
        this.howDidYouFindUs = howDidYouFindUs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getRegistrant() {
        return registrant;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public String getUserCode() {
        return userCode;
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

    public String getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    public String getDistrict() {
        return district;
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
