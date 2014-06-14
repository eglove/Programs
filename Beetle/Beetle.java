// Beetle with parts for the Beetle game
public class Beetle
{
	// Beetle parts.
	private boolean body, head, tail;
	private int eyes, feelers, legs;
	private int count = 0;
	
	// Roll count
	public int getRollCount() {
		count++;
		return this.count;
	}

	// A new body has no parts.
	public Beetle()
	{
		body = false;
		eyes = 0;
		feelers = 0;
		head = false;
		legs = 0;
		tail = false;
	}

	// Try to add a body and return whether this succeeded
	public boolean addBody()
	{
		if(body) {
			return false;
		} else {
			body = true;
			return true;
		}
	}
	
	public boolean addEye() {
		if(head && (eyes < 2)) {
			eyes++;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean addHead() {
		if(body && !head) {
			head = true;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean addFeeler() {
		if(head && (feelers < 2)) {
			feelers++;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean addLeg() {
		if(body && (legs < 6)) {
			legs++;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean addTail() {
		if(body && !tail) {
			tail = true;
			return true;
		} else {
			return false;
		}
	}
	
	// Return true if this Beetle has all of its parts
	public boolean isComplete() {
		return body && (eyes == 2) && (feelers == 2)
				&& head && (legs == 6) && tail;
	}
	
	public String toString() {
		if(body) {
			String result = "";
			if(feelers > 0) {
				result += "\\";
				if(feelers == 2) {
					result += " /";
				}
				result += "\n";
			}
			if(head) {
				if(eyes > 0) {
					result += "o";
				} else {
					result += " ";
				}
				result += "0";
				if(eyes == 2) {result += "o"; }
				result += "\n";
			}
			if(legs > 0) {
				result += "-";
			} else {
				result += " ";
			}
			result += "#";
			if(legs > 1) {
				result += "-";
			}
			result += "\n";
			if(legs > 2) {
				result += "-";
			} else {
				result += " ";
			}
			result += "#";
			if(legs > 3) {
				result += "-";
			}
			result += "\n";
			if(legs > 4) {
				result += "-";
			} else {
				result += " ";
			}
			result += "#";
			if(legs > 5) {
				result += "-";
			}
			if(tail) {
				result += "\n v";
			}
			return result;
		} else {
			return "(no parts yet)";
		}
	}
}