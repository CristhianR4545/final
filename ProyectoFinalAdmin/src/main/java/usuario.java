public class usuario {
    int cod;
    String name;
    int roll;
    String username;
    String password;
    String estatus;
    
    public usuario(){
    }
    
    public usuario(int cod, String name, int roll, String username, String password, String estatus){
        this.cod = cod;
        this.name = name;
        this.roll = roll;
        this.username = username;
        this.password = password;
        this.estatus = estatus;
    }
    
    public int getCod() {
        return cod;
    }
    
    public void setCod(int cod){
        this.cod = cod;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getRoll(){
        return roll;
    }
    
    public void setRoll(int roll){
        this.roll = roll;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getEstatus(){
        return estatus;
    }
    
    public void getEstatus(String estatus){
        this.estatus = estatus;
    }
    
    @Override
    public String toString(){
        return "usuario{" + "cod=" + cod + ", name=" + name + ", roll=" + roll + ", username=" + username + ", password=" + password + ", estatus=" + estatus + '}';
    }

    void setDbid(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setRoleUser(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setUserName(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setPwd(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setStatus(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setEstatus(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
