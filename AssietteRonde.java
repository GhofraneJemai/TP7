public class AssietteRonde extends Assiette {
	private double rayon;
	public AssietteRonde (int annee, double rayon)
	{
		super(annee);
		this.rayon = rayon;
	}
	public double getSurface(){
		return 3.14 * rayon *rayon ;
	}
	
}