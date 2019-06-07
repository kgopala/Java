package BaseFramework;

public class GlobalReporter {

    private static TestState _currentTestState ; //= TestState.Info;
    //= TestState.Info;
   //Able to access the below methods in the Main method without the need to create an object since, all these methods are static.

    public static TestState get_currentTestState() {
        return  _currentTestState;
    }
    public static void reportInfo(String message) {
        System.out.println("INFO: " + message);

    }

    public static void reportWarning(String message){
        System.out.println("WARNING: " + message);
        if (_currentTestState != TestState.Failure){
            _currentTestState = TestState.Warning;
        }
        _currentTestState = TestState.Warning;
        System.out.println(_currentTestState);
    }

    public  static void reportFailure(String message){
       System.out.println("FAILURE: " +message);
       _currentTestState = TestState.Failure;
    }

    public static void reportSuccess(String message){
        System.out.println("SUCCESS: " + message);
        if (_currentTestState != TestState.Failure && _currentTestState != TestState.Warning) {
            _currentTestState = TestState.Pass;
        }
    }
}
