
public class Train extends Vehicle implements IHaveStorage, IUseRails {
	//Intace Variables ---------------------------------------------------------------------
	private Boolean _storageCompartment;
	
	
	// Contructor ---------------------------------------------------------------------------
	public Train(Boolean storage) {
		this._storageCompartment = storage;
	}

	//Override Methods ----------------------------------------------------------------------
	@Override
	public Boolean useRails() {
		
		return (this.getPassangerCount() > 10)? true : false;
	}

	@Override
	public Boolean haveStorage() {
		
		return (this._storageCompartment == true)? true : false;
	}

}
