package br.org.neomama.siscad.user;

public enum Situation {

    ASSISTED("Assistido(a)"),
    PACIENT("Paciente"),
    VOLUNTARY("Voluntário(a)");

    private final String displayName;

    Situation(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
