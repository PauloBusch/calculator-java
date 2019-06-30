public class Arithmetic{
    public float soma(float v1, float v2) throws NegaException{
        float r=v1 + v2;
        if(r < 0)
            throw new NegaException();
        return r;
    }     
    public float subtrai(float v1, float v2) throws NegaException{
        float r=v1 - v2;
        if(r < 0)
            throw new NegaException();
        return r;
    }  
    public float divide(float v1, float v2) throws NegaException{
        float r=v1 / v2;
        if(r < 0)
            throw new NegaException();
        return r;
    }  
    public float multiplica(float v1, float v2) throws NegaException{
        float r=v1 * v2;
        if(r < 0)
            throw new NegaException();
        return r;
    }     
}