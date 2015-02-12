
public abstract class Vehicle {
	//Instance Variables (Fields) -----------------------------------------------------------
	private int _tireCount;
	private int _passangerCount;
	
	//Properties ----------------------------------------------------------------------------
	public int getTireCount() {
		return _tireCount;
	}

	public void setTireCount(int _tireCount) {
		this._tireCount = _tireCount;
	}
	
	public int getPassangerCount() {
		return _passangerCount;
	}

	public void setPassangerCount(int _passangerCount) {
		this._passangerCount = _passangerCount;
	}
	//Contructor ----------------------------------------------------------------------------
	public void Vehicle() {
		
	}

	//Override Public Method toString derrived from Object superclass
	@Override
	public String toString() {
		
		return "You the vehicle has " + this._tireCount + " tires.";
	}





}
