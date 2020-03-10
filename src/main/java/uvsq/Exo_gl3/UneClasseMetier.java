package uvsq.Exo_gl3;


import java.time.LocalDateTime;

public class UneClasseMetier {
	private Message messa;

	public UneClasseMetier(Message messa) {
		this.messa = messa;
	}
	public void intruction() {
		messa.display(LocalDateTime.now() + " : Début  de  uneMethodeMetier ");  //log message
		messa.display(LocalDateTime.now() + " :  Fin  de  uneMethodeMetier ");  //log message
	}

}