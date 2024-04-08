package cronometroeventosmanejador;

public class ManejadorCronometroEventListener implements CronometroEventListener{

    @Override
    public void StopCronometro(CronometroEventObject args) {
        // TODO Auto-generated method stub
        System.out.println("Voy a parar utilizando la funcionalidad a través del manejador");
        Cronometro cronoTemp;
        
        cronoTemp=(Cronometro)args.getSource();
        cronoTemp.getTask().cancel();
       
    }

    @Override
    public void StartCronometro(CronometroEventObject args) {
        // TODO Auto-generated method stub
        Cronometro cronoTemp;
        System.out.println("Voy a empezar utilizando la funcionalidad a través del manejador");
        cronoTemp=(Cronometro)args.getSource();
        cronoTemp.contar();
        
      
    }

    @Override
    public void ResetCronometro(CronometroEventObject args) {
        // TODO Auto-generated method stub
      
    }
    
}
