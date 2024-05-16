package mecanica;
        
public class MecanicaMetodos {
    private double VelInicial;
    private double Tiempo;
    private double x;
    private double angulo;
    private double y;
    private double voy;
    private double vox;
    private double gravedad = 9.81;
    private double Tiempomax;
    private double vy;
    private double yMax;
    private double xx;
    private double xy;
    private double tv;
    
    
    public MecanicaMetodos() {
    }

    public MecanicaMetodos(double VelInicial, double Tiempo) {
        this.VelInicial = VelInicial;
        this.Tiempo = Tiempo;
    }

    public MecanicaMetodos(double VelInicial, double Tiempo, double angulo) {
        this.VelInicial = VelInicial;
        this.Tiempo= Tiempo;
        this.angulo = angulo;
    }

    public double getVo() {
        return VelInicial;
    }

    public void setVo(double VelInicial){
        this.VelInicial = VelInicial;
    }

    public double getT() {
        return Tiempo;
    }

    public void setT(double t) {
        this.Tiempo = Tiempo;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getAng() {
        return angulo;
    }

    public void setAng(double ang) {
        this.angulo = ang;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getVoy() {
        return voy;
    }

    public void setVoy(double voy) {
        this.voy = voy;
    }

    public double getVox() {
        return vox;
    }

    public void setVox(double vox) {
        this.vox = vox;
    }

    public double getG() {
        return gravedad;
    }

    public void setG(double g) {
        this.gravedad = g;
    }

    public double getTmax() {
        return Tiempomax;
    }

    public void setTmax(double tmax) {
        this.Tiempomax = tmax;
    }

    public double getVy() {
        return vy;
    }

    public void setVy(double vy) {
        this.vy = vy;
    }

    public double getYmax() {
        return yMax;
    }

    public void setYmax(double ymax) {
        this.yMax = ymax;
    }

    public double getXx() {
        return xx;
    }

    public void setXx(double xx) {
        this.xx = xx;
    }

    public double getXy() {
        return xy;
    }

    public void setXy(double xy) {
        this.xy = xy;
    }

    public double getTv() {
        return tv;
    }

    public void setTv(double tv) {
        this.tv = tv;
    }

    public void coH(MecanicaMetodos Horizontal){
        double vx;
        vx = Horizontal.getVo();
        System.out.println("La velocidad en x es: "+ vx+"m/s");
    }
    public void coV(MecanicaMetodos Horizontal){
        double Vy;
        Vy = Horizontal.getG() * Horizontal.getT();
        System.out.println("La velocidad en y es: "+ Vy+"m/s");
    }
    public void MgV(MecanicaMetodos Horizontal){
        double vx,vy,v;
        vy = Horizontal.getG() * Horizontal.getT();
        vx = Horizontal.getVo();
        v= Math.sqrt(Math.pow(vx,2)*Math.pow(vy,2));
        System.out.println("La Magnitud de la velocidada es: "+ v+"m/s");
    }
    public void DiV(MecanicaMetodos Horizontal){
        double vy,ang,vx,gra;
        vy = Horizontal.getG() * Horizontal.getT();
        vx = Horizontal.getVo();
        ang=Math.toRadians(vy/vx);
        gra = Math.atan(ang);
        System.out.println("La direccion de la velocidad es: "+ gra+"°");
    }
    public void horizontal(MecanicaMetodos Horizontal){
        double x;
        x=Horizontal.getVo()*Horizontal.getT();
        System.out.println("El desplazamiento horizontal es: "+x+"m");
    }
    public void vertical(MecanicaMetodos Horizontal){
        double y;
        y=(Horizontal.getG()*(Math.pow(Horizontal.getT(), 2)))/2;
        System.out.println("El desplazamiento vertical es: "+y+"m");
    }
    public void DesplazamientoTotal(MecanicaMetodos Horizontal){
        double xt,x,y;
        y=(Horizontal.getG()*(Math.pow(Horizontal.getT(), 2)))/2;
        x=Horizontal.getVo()*Horizontal.getT();
        xt=Math.sqrt(Math.pow(y, 2)*Math.pow(x, 2));
        System.out.println("El desplazamiento Total es: "+xt+"m");
    }
    public void Alcance(MecanicaMetodos Horizontal){
        double xm,tv,vx;
        tv=Math.sqrt(((2*Horizontal.getVo())/Horizontal.getG()));
        vx = Horizontal.getVo();
        xm=vx*tv;
        System.out.println("El Alcance es: "+xm+"m");
    }
    public void TiempoVuelo(MecanicaMetodos Horizontal){
        double tv;
        tv=Math.sqrt(((2*Horizontal.getVo())/Horizontal.getG()));
        System.out.println("El Tiempo de vuelo es: "+tv+"s");
    }
    public void direccion(MecanicaMetodos Horizontal){
        double d,x,y,gra;
        y=(Horizontal.getG()*(Math.pow(Horizontal.getT(), 2)))/2;
        x=Horizontal.getVo()*Horizontal.getT();
        d=Math.toRadians(y/x);
        gra = Math.atan(d);
        System.out.println("La dirreccion es: "+gra+"°");
    }
    public void AlturaTiempo(MecanicaMetodos Horizontal){
        double y;
        y=Horizontal.getVo()-((Horizontal.getG()*Math.pow(Horizontal.getT(), 2))/2);
        System.out.println("La altura en funcion del tiempo es: "+y+"m");
    }
    public void coHori(MecanicaMetodos Invertido){
        double vox,ang,gra;
        ang=Math.toRadians(Invertido.getAng());
        gra = Math.cos(ang);
        vox = Invertido.getVo()*gra;
        System.out.println("La Velocidad de lanzamiento en x es: "+ vox);
    }
    public void coVert(MecanicaMetodos Invertido){
        double voy,ang,gra;
        ang=Math.toRadians(Invertido.getAng());
        gra = Math.sin(ang);
        voy = Invertido.getVo()*gra;
        System.out.println("La Velocidad de lanzamiento en y es: "+ voy);
    }
    public void HoriTiempo(MecanicaMetodos Invertido){
        double vx,vox,ang,gra;
        ang=Math.toRadians(Invertido.getAng());
        gra = Math.cos(ang);
        vox = Invertido.getVo()*gra;
        vx =vox;
        System.out.println("La velocidad en funcion del tiempo en x es: "+ vx+"m/s");
    }
    public void VertTiempo(MecanicaMetodos Invertido){
        double vy,voy,ang,gra;
        ang=Math.toRadians(Invertido.getAng());
        gra = Math.sin(ang);
        voy = Invertido.getVo()*gra;;
        vy =voy-(Invertido.getG()*Invertido.getT());
        System.out.println("La velocidad en funcion del tiempo en y es: "+ vy+"m/s");
    }
    public void MagniV(MecanicaMetodos Invertido){
        double vy,voy,ang,gra;
        ang=Math.toRadians(Invertido.getAng());
        gra = Math.sin(ang);
        voy = Invertido.getVo()*gra;;
        vy =voy-(Invertido.getG()*Invertido.getT());
        double vx,vox,angx,grax,v;
        angx=Math.toRadians(Invertido.getAng());
        grax = Math.cos(angx);
        vox = Invertido.getVo()*grax;
        vx =vox;
        v= Math.sqrt(Math.pow(vx,2)*Math.pow(vy,2));
        System.out.println("La magnitud de la velocidad en funcoion del tiempo es: "+ v+"m/s");
    }
    public void DireVel(MecanicaMetodos Invertido){
    double vy,voy,angy,gray;
        angy=Math.toRadians(Invertido.getAng());
        gray = Math.sin(angy);
        voy = Invertido.getVo()*gray;;
        vy =voy-(Invertido.getG()*Invertido.getT());
        double vx,vox,angx,grax,ang,gra;
        angx=Math.toRadians(Invertido.getAng());
        grax = Math.cos(angx);
        vox = Invertido.getVo()*grax;
        vx =vox;
        ang=Math.toRadians(vy/vx);
        gra = Math.atan(ang);
        System.out.println("La magnitud de la velocidad en funcoion del tiempo es: "+ gra+"°");
    }
    public void Desplazamientohorizontal(MecanicaMetodos Invertido){
        double x,vox,ang,gra;
        ang=Math.toRadians(Invertido.getAng());
        gra = Math.cos(ang);
        vox = Invertido.getVo()*gra;
        x=vox*Invertido.getT();
        System.out.println("El desplazamiento Horizontal es: "+ x+"m");
    }
    public void DesplazamientoVertical(MecanicaMetodos Invertido){
        double y,voy,ang,gra;
        ang=Math.toRadians(Invertido.getAng());
        gra = Math.sin(ang);
        voy = Invertido.getVo()*gra;
        y=voy*Invertido.getT()-((Invertido.getG()*Math.pow(Invertido.getT(), 2))/2);
        System.out.println("El desplazamiento Vertical es: "+ y+"m");
    }
    public void AlcanceMaximo(MecanicaMetodos Invertido){
        double xmax,vx,vox,angx,grax;
        angx=Math.toRadians(Invertido.getAng());
        grax = Math.cos(angx);
        vox = Invertido.getVo()*grax;
        vx =vox;
        double tv,t,voy,angy,gray;
        angy=Math.toRadians(Invertido.getAng());
        gray = Math.sin(angy);;
        voy = Invertido.getVo()*gray;
        t=voy/Invertido.getG();
        tv=2*t;
        xmax=vx*tv;
        System.out.println("EL alcance maximo es: "+xmax+"m/s");
    }
    public void AlturaMaximo(MecanicaMetodos Invertido){
        double y,voy,ang,gra;
        ang=Math.toRadians(Invertido.getAng());
        gra = Math.sin(ang);
        voy = Invertido.getVo()*gra;
        y=(Math.pow(voy, 2))/(2*Invertido.getG());
        System.out.println("La altura maxima es: "+ y+"m");
    }
    public void tiempoMaximo(MecanicaMetodos Invertido){
        double t,voy,ang,gra;
        ang=Math.toRadians(Invertido.getAng());
        gra = Math.sin(ang);
        voy = Invertido.getVo()*gra;
        t=voy/Invertido.getG();
        System.out.println("El tiempo maximo es: "+ t+"s");
    }
    public void tiempoVuelo(MecanicaMetodos Invertido){
        double tv,t,voy,ang,gra;
        ang=Math.toRadians(Invertido.getAng());
        gra = Math.sin(ang);
        voy = Invertido.getVo()*gra;
        t=voy/Invertido.getG();
        tv=2*t;
        System.out.println("El tiempo de vuelo es: "+ tv+"s");
    }    
}


