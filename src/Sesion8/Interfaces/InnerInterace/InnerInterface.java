package Sesion8.Interfaces.InnerInterace;

// public class InnerInterface implements Zoo.Paper{}
public class InnerInterface {
}

class Zoo{
    public interface Paper{
        public String getId();
    }
    public class Ticket implements Paper{
        private String serialNumber;
        public String getId(){
            return serialNumber;
        }
    }
}
