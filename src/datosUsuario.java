
public class datosUsuario {

	public datosUsuario(){
		
	}
	
	String usuario1;
	String pass1;
	
	public int probarPass(){
		usuario1 = login.txtUser.getText();
		pass1 = login.txtPass.getText();
		if(usuario1.equals("sebas")&& pass1.equals("123")){
			return 1;
		}else{
			return 0;
		}
	}
	
	
}
