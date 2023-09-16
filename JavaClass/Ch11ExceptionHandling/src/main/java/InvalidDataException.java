public class InvalidDataException extends Exception{
    @Override
    public String getMessage() {
        return "Name must be provided.";
    }
}
