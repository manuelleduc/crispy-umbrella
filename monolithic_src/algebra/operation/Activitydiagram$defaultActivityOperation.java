package algebra.operation;

import java.util.List;

import activitydiagram.InputValue;

public interface Activitydiagram$defaultActivityOperation extends algebra.operation.ActivitydiagramNamedElementOperation {

	void main(List<InputValue> inputValues);

	void terminate();
}