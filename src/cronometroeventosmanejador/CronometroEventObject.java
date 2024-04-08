package cronometroeventosmanejador;

import java.util.EventObject;

public class CronometroEventObject extends EventObject{
    Cronometro cronometro;

    public CronometroEventObject(Object source) {
        super(source);
        //TODO Auto-generated constructor stub
    }

    public CronometroEventObject(Object source,Cronometro cronometro) {
        super(source);
        //TODO Auto-generated constructor stub
        this.cronometro=cronometro;
    }

    public Cronometro getCronometro() {
        return cronometro;
    }

    public void setCronometro(Cronometro cronometro) {
        this.cronometro = cronometro;
    }

    
}
