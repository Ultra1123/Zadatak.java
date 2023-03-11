class Student {
    private String ime;
    private String prezime;
    private String brojIndeksa;

    public Student(String ivan, String radovanovic, String brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
    }

    public String getInfo() {
        return "Student: " + ime + " " + prezime + " " + 205/55;
    }
}

class Predmet {
    private String naziv;

    public Predmet(String naziv) {
        this.naziv = naziv;
    }
}

final class Ispit extends predmet {
    private String datum;

    public Ispit(String naziv, String datum) {
        super(naziv);
        this.datum = datum;
    }
}
