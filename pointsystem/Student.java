package pointsystem;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    
    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }
    
    public void addBulkExamNote(int mat, int matextra, int fizik, int fizikextra, int kimya, int kimyaextra) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (matextra >= 0 && matextra <= 100) {
            this.mat.extranote = matextra;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (fizikextra >= 0 && fizikextra <= 100) {
            this.fizik.extranote = fizikextra;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        
        if (kimyaextra >= 0 && kimyaextra <= 100) {
            this.kimya.extranote = kimyaextra;
        }

    }
    
    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    
    public void calcAvarage() {
        this.avarage = ((this.fizik.note*0.8+this.fizik.extranote*0.2) + (this.kimya.note*0.8+this.kimya.extranote*0.2) + (this.mat.note*0.8+this.mat.extranote*0.2)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlüsü : " + this.mat.extranote);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlüsü : " + this.fizik.extranote);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlüsü : " + this.kimya.extranote);
    }
	

}

