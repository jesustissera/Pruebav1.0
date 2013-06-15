import ar.edu.unlam.Bidding.Role
import ar.edu.unlam.Bidding.User
import ar.edu.unlam.Bidding.UserRole;


class BootStrap {

    def init = { servletContext ->
		User usuario1 = new User  (username:'nicolino',password:'1234',enabled:true,accountExpired:false,accountLocked:false,passwordExpired:false);
    	usuario1.save();
		Role rol1 = new Role(authority:'ROLE_ADMIN');
		rol1.save();
 
		UserRole.create(usuario1,rol1)
		
		
		
		}
    def destroy = {
    }
}
