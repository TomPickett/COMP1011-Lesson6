
public class Car extends Vehicle implements IHaveStorage, IUseRoads {
	//Instance Variables --------------------------------------------------------------------
	private Boolean _trunk;
	
	public Car(Boolean trunk) {
		this._trunk = trunk;
	}

	@Override
	public Boolean useRoads() {
		
		return (this.getTireCount()>0) ? true : false;
	}

	@Override
	public Boolean haveStorage() {
		
		return(this._trunk == true)? true : false ;
	}

}
