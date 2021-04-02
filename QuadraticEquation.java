public class QuadraticEquation {
        double numbera;
        double numberb;
        double numberc;

    public QuadraticEquation(double numbera, double numberb, double numberc) {
        this.numbera = numbera;
        this.numberb = numberb;
        this.numberc = numberc;
    }

    public double getNumbera() {
        return numbera;
    }

    public void setNumbera(double numbera) {
        this.numbera = numbera;
    }

    public double getNumberb() {
        return numberb;
    }

    public void setNumberb(double numberb) {
        this.numberb = numberb;
    }

    public double getNumberc() {
        return numberc;
    }

    public void setNumberc(double numberc) {
        this.numberc = numberc;
    }

    public double delta(){
        return(this.numberb*numberb - 4*(this.numbera*this.numberc));
    }
    public double x1(){
        return (-this.numberb) - Math.sqrt(this.delta()) / (2*this.numbera);
    }
    public double x2(){
        return (-this.numberb) + Math.sqrt(this.delta()) / (2*this.numbera);

    }
    public double twice(){
        return (-(this.numberb) / 2*this.numbera);
    }

}

