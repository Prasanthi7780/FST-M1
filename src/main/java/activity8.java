
class CustomException extends Exception {
    public CustomException(String msg) { super(msg); }
}

class CustomExceptionActivity {

    static void exceptionTest(String str) throws CustomException {
        if (str == null) throw new CustomException("String is null!");
        System.out.println(str);
    }

    public static void main(String[] args) {
        try {
            exceptionTest("Will print to console");
            exceptionTest(null);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
