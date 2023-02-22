package br.org.neomama.siscad.user;

public class ResponseUserCode {

    private long lastNumber;

    public ResponseUserCode() {
    }

    public ResponseUserCode(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }
}
