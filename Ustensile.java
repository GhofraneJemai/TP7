abstract class Ustensile {
    protected int annee;

    public Ustensile(int annee) {
        this.annee = annee;
    }

    public int getAnnee() {
        return annee;
    }

    public double getValeur(){
		int age = 2024 - annee;
		if (age > 50) {
			return age - 50;
		} else {
			return 0;
		}
	}
}