package exoAddition.session;

import javax.ejb.*;
import javax.jws.WebService;
@WebService
@Stateless (mappedName="exoAddition")
public class AdditionBean implements AdditionItf {

	public int addition(int a, int b) {
		return (a+b);
	}
}
